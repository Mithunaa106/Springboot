package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.AppConfig;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class ApiController {
    @Autowired 
    public AppConfig ap;

    @RequestMapping("/map")
    public String getAppName()
    {
        return ap.getAppName()+" "+ap.getAppVersion();
    }
    
}
