package com.yiibai.output;

public class Customer {

    private String name;
    private String address;
    private Integer age;

    public Customer(String name, String address, int age) {
        CustomerBuild(name, address, age);
    }

    public Customer(String address, int age, String name) {
        this.address = address;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "/" + this.address + "/" + this.age;
    }

    public Customer CustomerBuild(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
        return this;
    }
}
