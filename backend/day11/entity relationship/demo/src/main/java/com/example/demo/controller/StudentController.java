package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import com.example.demo.service.StudentService;
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student createe(@RequestBody Student student)
    {
        return studentService.Post(student);
    }

    @PostMapping("/studentinfo")
    public Student create(@RequestBody Student student) {
        
        return studentService.Post(student);
    }
    

    @GetMapping("/student")
    public List<Student>findAllStudents()
    {
        return studentService.Get();
    }

}
