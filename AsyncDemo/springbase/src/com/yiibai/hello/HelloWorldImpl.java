package com.yiibai.hello;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHello(String msg) {
        System.out.println("sayHello:" + msg);
    }
}
