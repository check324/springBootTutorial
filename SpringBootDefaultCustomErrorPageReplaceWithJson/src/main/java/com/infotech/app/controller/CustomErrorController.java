package com.infotech.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotech.app.model.ErrorJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

public class CustomErrorController implements ErrorController {
    private static final String PATH = "/error";

    @Value("${debug}")
    private boolean debug;

    @Autowired
    private ErrorAttributes errorAttributes;

    @RequestMapping(value = PATH)
    ErrorJson error(HttpServletRequest request, HttpServletResponse response){
        return new ErrorJson(response.getStatus(), getErrorAttributes(request, debug));
    }

    @Override
    public String getErrorPath(){
        return PATH;
    }

    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean debug) {
        WebRequest webRequest = new ServletWebRequest(request);
        return errorAttributes.getErrorAttributes(webRequest, debug);
    }
}
