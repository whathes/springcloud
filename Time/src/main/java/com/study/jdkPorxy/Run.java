package com.study.jdkPorxy;


import java.lang.reflect.Proxy;

public class Run {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceAImpl();
        ServiceA proxy = (ServiceA) Proxy.newProxyInstance(serviceA.getClass().getClassLoader(),
                serviceA.getClass().getInterfaces(), new ProxyServiceA(serviceA));
        proxy.printA();

    }
}
