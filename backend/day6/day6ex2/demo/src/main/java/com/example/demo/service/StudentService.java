
package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
    public StudentRepo studentRepo;
    public StudentService(StudentRepo studentRepo)
    {
        this.studentRepo = studentRepo;
    }
    public boolean postStudent(Student student)
    {
        try{

            studentRepo.save(student);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Student> paginationStudents(int pageno,int size)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<Student>  sortPaginationStudents(int pageno,int size,String field)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
