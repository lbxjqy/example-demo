package com.yiibai.hello;

public class HelloWorlImpl implements HelloWorld {
    @Override
    public void sayHello(String msg) {
        System.out.println("HelloWorlImpl " + msg);
    }
}
