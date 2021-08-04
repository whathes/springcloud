package com.study.deadLock;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Thread.sleep;

public class DeadLock {
    private static String A = "a";
    private static String B = "b";

    public static void main(String[] args) {
//        Thread thread1 = new Thread(()->{
//          synchronized (A){
//              try {
//                  sleep(1000);
//
//              } catch (InterruptedException e) {
//                  e.printStackTrace();
//              }
//          }
//        });
        String[] s = new String[]{"a","a","b","c","ab","ba","abc"};
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n;
                if (o1.length()>o2.length()) n=1;
                else n=-1;
                return n;
            }
        });
        for (String ss :s){
            System.out.println(ss);
        }
    }



}
