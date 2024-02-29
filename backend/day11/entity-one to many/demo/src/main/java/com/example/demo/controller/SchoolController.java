package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.School;

import com.example.demo.service.SchoolService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/school")
    public School postMethodName(@RequestBody School entity) {
        return schoolService.post(entity);
    }

    @GetMapping("/school")
    public List<School> getMethodName() {
        return schoolService.want();
        
    }
    
}
