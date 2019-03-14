package com.example.demo.controller;

import com.example.demo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @description: controller
 * @author: lin
 * @create: 2019/02/14 14:16
 */

@RestController
public class Controller {

    @Resource
    Service service;

    @GetMapping("/test")
    public void test() {
        service.test();
    }

    @GetMapping("/range")
    public Set<String> range() {
        return service.range();
    }

    @GetMapping("zCard")
    public Long zCard() {
        return service.zCard();
    }
}
