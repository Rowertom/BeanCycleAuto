package ru.learnUp.cycleAuto.BeanCycleAuto.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspects {

    private static final Logger log = LoggerFactory.getLogger(Aspects.class);

    @Around("@annotation(ru.learnUp.cycleAuto.BeanCycleAuto.WorkTime)")
    public Object logWorkTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object pro = joinPoint.proceed();
        long workTime = System.currentTimeMillis() - start;
        log.info("ATTENTION! {} выполнено за {} мс", joinPoint.getSignature(), workTime);
        return pro;
    }

   @Before("@annotation(ru.learnUp.cycleAuto.BeanCycleAuto.LogMethod)")
    public void logging(JoinPoint joinPoint){
        log.info("INFORMATION!!! {}", joinPoint);
    }

}
