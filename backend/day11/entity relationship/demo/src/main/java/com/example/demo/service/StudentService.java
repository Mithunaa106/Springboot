package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.StudentinformationRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentinformationRepository studentinformationRepository;

    public Student Post(Student student)
    {
        return studentRepository.save(student);
    }


    public List<Student> Get()
    {
        return studentRepository.findAll();
    }

}
