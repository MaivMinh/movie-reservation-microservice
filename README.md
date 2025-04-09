# Movie Reservation Microservice

## Giới thiệu

Dự án **Movie Reservation Microservice** là một hệ thống đặt vé xem phim được xây dựng theo kiến trúc Modular Monolithic Architecture. Hệ thống cho phép người dùng tìm kiếm phim, xem lịch chiếu và đặt vé trực tuyến một cách thuận tiện.

## Kiến trúc hệ thống

Hệ thống được thiết kế theo kiến trúc microservice, bao gồm các thành phần chính sau:

- **Service Booking**: Quản lý thông tin đặt vé của người dùng.
- **Service Movie**: Cung cấp thông tin về các bộ phim hiện có.
- **Service Auth**: Quản lý thông tin người dùng và xác thực.

## Công nghệ sử dụng

- **Java**: Ngôn ngữ lập trình chính cho các microservice.
- **Spring Boot**: Framework để xây dựng các ứng dụng microservice.
- **Docker**: Đóng gói và triển khai các microservice.
- **Redis**: Lưu trữ dữ liệu tạm thời và caching.
- **RabbitMQ**: Hệ thống hàng đợi tin nhắn để giao tiếp giữa các microservice.
- **Websocket**: Sử dụng để cập nhật trạng thái của ghế ngồi realtime.

## Cấu trúc thư mục

- `.github/workflows`: Cấu hình cho GitHub Actions.
- `app`: Thư mục chứa mã nguồn của các microservice.
- `docker-compose.yml`: Tệp cấu hình để khởi động toàn bộ hệ thống bằng Docker Compose.
- `example.env`: Tệp mẫu cho các biến môi trường cần thiết.

## Hướng dẫn cài đặt và chạy dự án

1. **Yêu cầu hệ thống**:
   - Docker và Docker Compose được cài đặt trên máy.

2. **Cài đặt**:
   - Sao chép dự án về máy:
     ```bash
     git clone https://github.com/MaivMinh/movie-reservation-microservice.git
     ```
   - Chuyển vào thư mục dự án:
     ```bash
     cd movie-reservation-microservice
     ```
   - Tạo tệp `.env` từ tệp `example.env` và cập nhật các biến môi trường phù hợp.

3. **Chạy dự án**:
   - Khởi động các dịch vụ bằng Docker Compose:
     ```bash
     docker-compose up --build
     ```
   - Sau khi các dịch vụ đã khởi động, hệ thống sẽ sẵn sàng để sử dụng tại `http://localhost:8888` (hoặc cổng được cấu hình).

## Đóng góp

Chúng tôi hoan nghênh mọi đóng góp từ cộng đồng. Vui lòng tạo một pull request hoặc mở một issue để thảo luận về những thay đổi bạn muốn thực hiện.

## Giấy phép

Dự án này được cấp phép theo giấy phép MIT. Vui lòng xem tệp `LICENSE` để biết thêm chi tiết.
