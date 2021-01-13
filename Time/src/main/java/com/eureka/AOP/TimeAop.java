package com.eureka.AOP;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class TimeAop {
    @Pointcut("execution(* java.lang.System.currentTimeMillis())")
    public void timeAop(){
    }


    @Pointcut("execution(* com.eureka.controller.WebController.time())")
    public void timeRequestAOP(){
    }
    @Around("timeRequestAOP()")
    public String beforeTime(){
        Long temp = System.currentTimeMillis();
        Date time = new Date(temp);
        System.out.println(time.toString());
        if(time.toString().equals(null))
            System.out.println(1);
        return time.toString();
    }


    @Before("timeAop()")
    public Long before(){
        Long temp = System.currentTimeMillis();
        Date time = new Date(temp);
        System.out.println(time.toString());
        return temp;
    }


    @After("timeAop()")
    public Long getNewTime(){
        Long temp = System.currentTimeMillis();
        Date time = new Date(temp);
        System.out.println(time.toString());
        return temp;
    }
}
