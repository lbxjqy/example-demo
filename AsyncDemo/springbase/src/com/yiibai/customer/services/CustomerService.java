package com.yiibai.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yiibai.customer.dao.CustomerDAO;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private String name;
    private String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName() {
        System.out.println("Customer name" + this.name);
    }

    public void printUrl() {
        System.out.println("Customer url" + this.url);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }
}
