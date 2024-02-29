package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.book;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class bookController {
    @GetMapping("/book")
    public book getMethodName() {
        book b=new book(book : "lalaland", author:"mithunaa", new Date());
        return b;
    }
    
}
