package com.example.demo.Exception;

import com.example.demo.entity.ErrorInfo;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonHandler(HttpServletRequest request) {
        System.out.println("myException");
        ErrorInfo<String> errorInfo = new ErrorInfo<String>();
        errorInfo.setCode(-1);
        errorInfo.setUrl(request.getRequestURI().toString());
        errorInfo.setMessage("拦截MyException");
        errorInfo.setData("some data");
        return errorInfo;
    }
}
