package com.eureka.singleton;

public class SingletonBean {
    private volatile static SingletonBean instance;
    private SingletonBean() {
    }
    private static SingletonBean getInstance(){
        if(instance==null){
            synchronized(SingletonBean.class){
                instance=new SingletonBean();
            }
        }
        return instance;
    }
}
