===================== Docker compose file =====================

1. Chú ý quan trọng rằng, đối với các service của spring boot thì phải đưa về port mặc định là 8080, sau đó expose ra
   8080 trong Dockerfile và cuối cùng mới là mapping về port phù hợp trong docker-compose.yml.
    - Mục tiêu cho điều này là đồng bộ lại các internal port trong container của spring boot app.
    - Việc chúng ta expose nó giống như việc chúng ta sẽ lựa chọn các port tồn tại bên trong container và cho phép port
      nào sẽ được tiếp xúc ra bên ngoài
    - Nếu chúng ta expose ra các port mà không có trong danh sách các interal port của container thì chắc chắc việc
      mapping cũng sẽ không chính xác.
    - Ví dụ:
        - server.port=8080
        - EXPOSE 8081
        - ports:
            - "8081:8081"
              -> Với ví dụ trên thì khi mà client truy cập vào host machine với port 8081 thì sẽ không thể truy cập được
              vào trong ứng dụng vì port 8081 không tồn tại trong container hoặc nếu tồn tại thì sẽ là của một ứng dụng
              khác chứ không phải là ứng dụng mà ta mong muốn.

===================== Spring WebSocket =====================

1. Trong các hệ thống có sử dụng WebSocket và External Broker thì về cơ bản sẽ có 2 phần.
    - Phần 1: Là phần server sẽ tạo ra một WebSocket server để lắng nghe các kết nối từ client.
    - Phần 2: Là phần WebSocket server sẽ kết nối tới một external broker như RabbitMQ, ActiveMQ, Kafka, ... để gửi và
      nhận các message từ client.
2. Bởi vì các hệ thống trên có 2 phần chính, do đó ở mỗi phần chúng ta có thể sử dụng các giao thức(protocol) khác nhau
   để thực hiện kết nối cũng như trao đổi message:
    - Phần 1: Sử dụng giao thức WebSocket(SockJS || STOMP) để kết nối và trao đổi message giữa Client và WebSocket
      Server.
    - Phần 2: Có thể sử dụng AMQP, MQTT, STOMP, ... để kết nối và trao đổi message giữa WebSocket Server và External
      Broker.
3. LUỒNG HOẠT ĐỘNG CỦA 1 HỆ THỐNG WEBSOCKET NHƯ SAU:

   _**1. Message Flow to RabbitMQ:**_
      - Khi WebSocket Server nhận được message từ phía Client, nó sẽ xử lý, và nếu sử dụng AMQP thì sẽ gửi message đó tới exchange của RabbitMQ.
   
   _**2. RabbitMQ Internal Routing:**_
      - Exchange sẽ route message đó tới queue phù hợp dựa trên routing key.
   
   _**3. Return Path to Clients:**_
      - Khi có một client thực hiện _.subcribe()_ tới WebSocket Server(lưu ý rằng client không biết gì về RabbitMQ nên phải thực hiện subcribe gián tiếp qua WebSocket Server), WebSocket Server sẽ tạo ra một Subcription tương ứng tới một queue trong RabbitMQ.
      - WebSocket Server sau đó sẽ forward message có trong các queue tới  cho subscription tương ứng.
        
   _**4. Message Conversion:**_
      - Sau khi message chuyển tới Subcription tương ứng thì lúc này sẽ sử dụng _**MessageConverter**_ bean đã khởi tạo trọng RabbitMQConfiguration file để _convert phần body của message từ byte[] sang Object_.
      _**- Cuối cùng là chuyển về cho Client thông qua WebSocket Server và thông qua STOMP.**_
