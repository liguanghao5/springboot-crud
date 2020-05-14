package com.hao.springbootcrud.controller;


import com.hao.springbootcrud.dao.UserloginMapper;
import com.hao.springbootcrud.dao.UserloginlogMapper;
import com.hao.springbootcrud.entities.Userloginlog;
import com.hao.springbootcrud.exception.UserNotExistException;
import com.hao.springbootcrud.utils.IpUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class loginController {

   @Autowired
   UserloginMapper userloginMapper;

   @Autowired
   UserloginlogMapper userloginlogMapper;


     Log log = LogFactory.getLog(loginController.class);


    @ResponseBody
    @PostMapping(value = "user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String , Object> map, HttpServletRequest request, HttpSession session){

        if(username != null && password .equals("123456")){
            if("aaa".equals(username)){
                throw new UserNotExistException();
            }else if("bbb".equals(username)){
                throw new RuntimeException();
            }

            session.setAttribute("token",username+"-"+password);
            //登陆成功

           String ip = IpUtils.getIp(request);
            String remoteAddr = request.getRemoteAddr();
            log.info("remoteAddr"+remoteAddr);
            log.info("访问的ip为："+ip);

            Userloginlog userloginlog = userloginlogMapper.selectByPrimaryKey(1);
            System.out.println("aa"+userloginlog);
            Userloginlog userloginlog2 = userloginlogMapper.selectByPrimaryKey2(1);
            System.out.println("bb"+userloginlog2);
            Userloginlog userloginlog3 = userloginlogMapper.selectByPrimaryKey3(1);
            System.out.println("cc"+userloginlog3);


            return "redirect:/mainlist.html";

        }else{

            map.put("msg","用户名或密码错误");

            return "index";

        }



    }







}
