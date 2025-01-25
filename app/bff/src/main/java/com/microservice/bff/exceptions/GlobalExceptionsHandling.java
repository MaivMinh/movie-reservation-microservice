package com.microservice.bff.exceptions;

import com.microservice.bff.response.ExceptionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.NestedRuntimeException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice(annotations = RestController.class)
@Order(1)
public class GlobalExceptionsHandling {
  @ExceptionHandler({NestedRuntimeException.class})
  public ResponseEntity<ExceptionResponse> handleNestedRuntimeException(NestedRuntimeException exception) {
    return ResponseEntity.ok().body(new ExceptionResponse(HttpStatus.BAD_REQUEST.value(),  "Invalid input params", null));
  }


  @ExceptionHandler({RuntimeException.class})
  public ResponseEntity<ExceptionResponse> handleRuntimeException(RuntimeException exception) {
    return ResponseEntity.ok().body(new ExceptionResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),  exception.getMessage(),null));
  }
}