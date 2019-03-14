package com.yiibai.common;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Customer {
    private Person person;
    private List<Object> lists;
    private Set<Object> sets;
    private HashMap<Object, Object> maps;
    private Properties pros;

    public Customer() {

    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Customer(Person person) {
        this.person = person;
    }
}
