package com.example.score.service;

import com.example.score.dto.EnrollmentRequestDto;
import com.example.score.model.Enrollment;
import com.example.score.model.Student;
import com.example.score.model.Subject;
import com.example.score.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    private final EnrollmentRepository repository;

    public EnrollmentService(EnrollmentRepository repository) {
        this.repository = repository;
    }

    public List<Enrollment> getEnrollmentByStudentId(Student student){
        return repository.findEnrollmentsByStudent(student);
    }

    public void update(Long studentId, EnrollmentRequestDto.EnrollmentUpdateDto dto, Subject subject){

    }
}
