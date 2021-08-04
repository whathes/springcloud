package com.study;

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

    @Test
    public void leetcode(){
        int[] nums = {0,0,0,1,0,1,1,0};
        int[] arr = new int[9];
        int k =3;
        int n = 8;
        int ans=0;
        for (int i = 0, cnt = 0; i < n; i++) {
            cnt += arr[i];
            if ((nums[i] + cnt) % 2 == 0) {
                if (i + k > n) return ;
                arr[i + 1]++;
                arr[i + k]--;
                ans++;
            }
            System.out.println(nums.toString());
            System.out.println(arr.toString());
        }
    }
}
