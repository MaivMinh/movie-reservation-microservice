===================== Docker compose file =====================
1. Chú ý quan trọng rằng, đối với các service của spring boot thì phải đưa về port mặc định là 8080, sau đó expose ra 8080 trong Dockerfile và cuối cùng mới là mapping về port phù hợp trong docker-compose.yml.
   - Mục tiêu cho điều này là đồng bộ lại các internal port trong container của spring boot app.
   - Việc chúng ta expose nó giống như việc chúng ta sẽ lựa chọn các port tồn tại bên trong container và cho phép port nào sẽ được tiếp xúc ra bên ngoài
   - Nếu chúng ta expose ra các port mà không có trong danh sách các interal port của container thì chắc chắc việc mapping cũng sẽ không chính xác.
   - Ví dụ:
     - server.port=8080
     - EXPOSE 8081
     - ports:
       - "8081:8081"
     -> Với ví dụ trên thì khi mà client truy cập vào host machine với port 8081 thì sẽ không thể truy cập được vào trong ứng dụng vì port 8081 không tồn tại trong container hoặc nếu tồn tại thì sẽ là của một ứng dụng khác chứ không phải là ứng dụng mà ta mong muốn. 
