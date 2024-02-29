package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class StudentController {
     
    @Autowired
    public Student st;

    @RequestMapping("/Student")
    public String getName () {
        return st.getName()+" "+st.getAge();
    }
    
}
