package com.microservice.authservice.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Slf4j
@Aspect /// Để thể hiện đây là một Aspect thì chúng ta sử dụng @Aspect
@Component
public class LoggerAspect {


  /// Join point luôn đại diện cho việc thực thi một method. Nó chứa thông tin về method như tên, tham số, modifier, ...

  // Một @Pointcut thực hiện việc gom các nhóm lại với nhau. Advice sẽ làm việc với các nhóm đã match với @Pointcut này.
  @Pointcut("execution(* com.microservice.authservice..*.*(..))")
  public void springBeanPointCut() {
  }


  @Around(value = "springBeanPointCut()")
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    log.info(joinPoint.getSignature().toString() + " method execution start");
    Instant start = Instant.now();
    Object returnObj = joinPoint.proceed();
    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    log.info("Time took to execute " + joinPoint.getSignature().toString() + " method is : " + timeElapsed + " ms");
    log.info(joinPoint.getSignature().toString() + " method execution end");
    return returnObj;
  }

  // Phương thức này giúp Developer nắm rõ hơn về lỗi đã được throw ra trước đó. Chỉ có tác dụng với Dev, User không nhận được thông báo này.
  @AfterThrowing(value = "springBeanPointCut()", throwing = "e")
  public void logException(JoinPoint joinPoint, Exception e) {
    e.printStackTrace();
  }
}
