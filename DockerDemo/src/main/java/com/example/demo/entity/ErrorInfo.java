package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ErrorInfo<T> implements Serializable {
    private Integer code;
    private String message;
    private String url;
    private T data;
}
