package com.study.source;

import org.springframework.boot.SpringApplication;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class SourceCode {
    private HashMap map;
    private ConcurrentHashMap concurrentHashMap;
    private SpringApplication application;
    private ReentrantLock lock;
    private AbstractQueuedSynchronizer aqs;
    private Semaphore semaphore;
    private CountDownLatch countDownLatch;
    private CyclicBarrier cyclicBarrier;


    public static void main(String[] args) {
        byte[] bytes = "#".getBytes();
        for(byte b :bytes){
            System.out.println(b);
        }
    }


}
