package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import com.example.demo.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student postMethodName(@RequestBody Student student) {
        return studentService.post(student);
    }

    @GetMapping("/student")
    public List<Student> getMethodName() {
        return studentService.want();
    }
    
    
}
