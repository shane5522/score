package com.example.score.service;

import com.example.score.model.Student;
import com.example.score.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    //조회
    public List<Student> getList(){
        return repository.findAll();
    }

    //추가
    public void save(Student student){
        repository.save(student);
    }
}
