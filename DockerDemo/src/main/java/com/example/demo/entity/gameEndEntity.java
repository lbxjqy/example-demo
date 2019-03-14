package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class gameEndEntity implements Serializable {
    private int id;
    private String orderNo;
    private int cupNumber;
    private String horse;
    private String grade;
}
