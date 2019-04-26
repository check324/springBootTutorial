package com.infotech.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements ErrorController {

    private static final String PATH = "/error";
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }

//    @RequestMapping(value = PATH, method = RequestMethod.GET)
//    public String defaultErrorMesasge(){
//        return "Requested Resource is not found!!!";
//    }
    @Override
    public String getErrorPath() {
        return PATH;
    }
}
