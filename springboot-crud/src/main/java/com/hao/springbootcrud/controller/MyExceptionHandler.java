package com.hao.springbootcrud.controller;

import com.hao.springbootcrud.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request){

        request.setAttribute("javax.servlet.error.status_code",400);

        Map<String,Object> map = new HashMap<>();

        //自定义异常信息
        map.put("message",e.getMessage());
        map.put("lighcode","liguanghao");

        request.setAttribute("ext",map);//把自定义的异常信息放在request中

        return "forward:/error";//转发到error利用系统自带的异常处理器处理，只不过是带上自己定义的异常信息  BasicErrorController
    }


}
