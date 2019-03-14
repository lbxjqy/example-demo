package com.yiibai.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class HijackAroundMethod implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method name :" + methodInvocation.getMethod().getName());
        System.out.println("Method arguments :" + Arrays.toString(methodInvocation.getArguments()));
        System.out.println("Method before");
        try {
            Object result = methodInvocation.proceed();
            System.out.println("Method after");
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("Throw");
            throw e;
        }
    }
}
