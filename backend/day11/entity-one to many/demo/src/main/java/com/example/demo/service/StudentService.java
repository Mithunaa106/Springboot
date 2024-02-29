package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student post(Student student)
    {
        return studentRepository.save(student);
    }

    public List<Student>want()
    {
        return studentRepository.findAll();
    }

}
