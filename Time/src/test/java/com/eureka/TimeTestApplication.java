package com.eureka;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootApplication
public class TimeTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimeTestApplication.class,args);
    }
    @Test
    public void timeTest(){
        Lock lock = new ReentrantLock();
        Thread t = new Thread();
    }
}
