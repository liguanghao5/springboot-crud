package com.hao.springbootcrud.config;


import com.hao.springbootcrud.component.MyHandlerInterceptor;
import com.hao.springbootcrud.component.MylocaleResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringmvcConfig implements WebMvcConfigurer {


    /**
     * 视图映射
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/mainlist.html").setViewName("dashboard");


    }


    /**
     *拦截器取消哪些访问的拦截
     * @param registry
     */
   @Override
    public void addInterceptors(InterceptorRegistry registry) {

        MyHandlerInterceptor myHandlerInterceptor = new MyHandlerInterceptor();

       List<String> list = new ArrayList<>();
       list.add("/");
       list.add("/index.html");
       list.add("/user/login");
       list.add("/static/**");
       list.add("/asserts/**");
       list.add("/webjars/**");
       list.add("/**/error");
       //list.add("http://www.beian.miit.gov.cn");//工信部网站

        registry.addInterceptor(myHandlerInterceptor).addPathPatterns("/**").excludePathPatterns(list);


    }

    /**
     * 国际化语言解析
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){


        return new MylocaleResolver();
    }



}
