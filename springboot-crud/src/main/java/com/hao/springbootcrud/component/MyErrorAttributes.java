package com.hao.springbootcrud.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {


    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);

        Map ext = (Map) webRequest.getAttribute("ext", 0);

        errorAttributes.put("ext",ext);//把自己添加的异常信息加到默认的异常信息中
        errorAttributes.put("logo","自定义异常信息");

        return errorAttributes;
    }
}
