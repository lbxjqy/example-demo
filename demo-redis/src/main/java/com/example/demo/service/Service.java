package com.example.demo.service;

import java.util.Set;

/**
 * @description: service
 * @author: lin
 * @create: 2019/02/14 14:17
 */
public interface Service {
    void test();

    Set<String> range();

    Long zCard();
}
