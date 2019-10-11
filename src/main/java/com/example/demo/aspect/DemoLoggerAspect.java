package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggerAspect {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.example.demo.service.UserServiceImpl.*.*(..))")
    public void logFindUserEvent(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
        LOGGER.info("Log validate user event" + new java.util.Date() + " - " + joinPoint.getSignature().getName());
    }
}
