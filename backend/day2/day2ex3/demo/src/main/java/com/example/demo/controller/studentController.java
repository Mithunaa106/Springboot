package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class studentController {
    @GetMapping("/ignore")
    public student getdetails()
    {
        student s=new student(106, "mithunaa", "hello");
        return s;

    }
  
    
}
