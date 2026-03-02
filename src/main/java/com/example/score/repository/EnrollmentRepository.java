package com.example.score.repository;

import com.example.score.model.Enrollment;
import com.example.score.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment> findEnrollmentsByStudent(Student student);
}
