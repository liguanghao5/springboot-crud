package com.hao.springbootcrud.component;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MylocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        String i18n = request.getParameter("i18n");

        Locale locale =  Locale.getDefault();

        if(!StringUtils.isEmpty(i18n)){

            String[] split = i18n.split("_");

             locale = new Locale(split[0], split[1]);


        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, @Nullable HttpServletResponse httpServletResponse, @Nullable Locale locale) {

    }
}
