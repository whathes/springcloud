package com.study.jdkPorxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyServiceA implements InvocationHandler {

    private final Object t;

    public ProxyServiceA(Object t) {
        this.t = t;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Before A");
        Object r = method.invoke(t, args);
        System.out.println("After A");
        return r;
    }
}
