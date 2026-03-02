package com.example.score.service;

import com.example.score.model.Enrollment;
import com.example.score.model.Subject;
import com.example.score.repository.SubjectRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository repository;

    public SubjectService(SubjectRepository repository) {
        this.repository = repository;
    }
}
