package com.microservice.commentservice.service;

import com.microservice.commentservice.response.Seat;
import com.microservice.websocket_proto.*;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class SeatReservationService {
  private final RabbitTemplate rabbitTemplate;

  ///  Store temporary seat locks with expiration time.
  private final Map<Integer, Map<Integer, Seat>> lockedSeats;
  private final RabbitMQService rabbitMQService;

  public SeatReservationService(RabbitTemplate rabbitTemplate, RabbitMQService rabbitMQService) {
    this.rabbitTemplate = rabbitTemplate;
    this.lockedSeats = new ConcurrentHashMap<>();
    /// Thực hiện clean các lock hết hạn sau mỗi 6 phút.
    startLockCleaner();
    this.rabbitMQService = rabbitMQService;
  }

  private void startLockCleaner() {
    new Thread(() -> {
      while (true) {
        try {
          Thread.sleep(10000);
          long now = System.currentTimeMillis();

          for (Map.Entry<Integer, Map<Integer, Seat>> entry : lockedSeats.entrySet()) {
            Integer showtimeId = entry.getKey();
            Map<Integer, Seat> seats = entry.getValue();

            /// Thực hiện lấy ra danh sách tất cả các ghế ngồi đã hết hạn.
            // Correct version - finding seats that HAVE expired
            List<Seat> expiredSeats = seats.values().stream().filter(seat -> seat.getExp() < now).toList();
            for (Seat seat : expiredSeats) {
              seat.setReserved(false);
              seats.remove(seat.getSeatId());
            }

            /// Thực hiện chuyển danh sách tất cả các ghế ngồi đã hết hạn về cho phía Client.
            rabbitTemplate.convertAndSend("holding", "", Map.of("showtimeId", showtimeId, "seats", expiredSeats));
          }
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          break;
        }
      }
    }).start();
  }

  public CreatePreSeatReservationResponse createPreSeatReservation(CreatePreSeatReservationRequest request) {
    /// Hàm thực hiện giữ chỗ ghế.
    int showtimeId = request.getShowtimeId();
    List<Integer> seats = request.getSeatsList();
    if (lockedSeats.containsKey(showtimeId)) {
      Map<Integer, Seat> value = lockedSeats.get(showtimeId);
      for (Integer seat : seats) {
        if (value.containsKey(seat)) {
          /// Tồn tại ghế đã được lock trước đó rồi. Nên do đó trả về trạng thái để thông báo cho người dùng chọn vị trí ghế ngồi khác.
          try {
            rabbitTemplate.convertAndSend("holding", "", Map.of("showtimeId", showtimeId, "seats", value.values().stream().toList()));
          } catch (AmqpException e) {
            return CreatePreSeatReservationResponse.newBuilder()
                    .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .setMessage("AMQP Exception!")
                    .build();
          }
          return CreatePreSeatReservationResponse.newBuilder()
                  .setStatus(400)
                  .setMessage("Danh sách tồn tại ghế đã được giữ chỗ trước đó!")
                  .build();
        }
      }
      /// Lock các ghế.
      for (Integer seat : seats) {
        value.put(seat, new Seat(seat, true, System.currentTimeMillis() + 10 * 1000));
      }
      try {
        rabbitTemplate.convertAndSend("holding", "", Map.of("showtimeId", showtimeId, "seats", value.values().stream().toList()));
      } catch (AmqpException e) {
        return CreatePreSeatReservationResponse.newBuilder()
                .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .setMessage("AMQP Exception!")
                .build();
      }
    } else {
      Map<Integer, Seat> value = new ConcurrentHashMap<>();
      for (Integer seat : seats) {
        value.put(seat, new Seat(seat, true, System.currentTimeMillis() + 10 * 1000));
      }
      lockedSeats.put(showtimeId, value);
      try {
        rabbitTemplate.convertAndSend("holding", "", Map.of("showtimeId", showtimeId, "seats", value.values().stream().toList()));
      } catch (AmqpException e) {
        return CreatePreSeatReservationResponse.newBuilder()
                .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .setMessage("AMQP Exception!")
                .build();
      }
    }
    return CreatePreSeatReservationResponse.newBuilder()
            .setStatus(200)
            .setMessage("Giữ chỗ thành công!")
            .build();
  }

  public DeclareQueueResponse declareQueue(DeclareQueueRequest request) {
    /// Hàm thực hiện tạo ra một queue tương ứng mới dựa vào session-id.

    String queueName = "holding." + request.getAccountId();

    int status = rabbitMQService.declareQueue(queueName);
    return DeclareQueueResponse.newBuilder()
            .setStatus(status)
            .setMessage("Tạo queue thành công!")
            .build();
  }

  public RemoveQueueResponse removeQueue(RemoveQueueRequest request) {
    String queueName = "holding." + request.getAccountId();
    rabbitMQService.removeQueue(queueName);
    return RemoveQueueResponse.newBuilder()
            .setStatus(200)
            .setMessage("Xóa queue thành công!")
            .build();
  }
}