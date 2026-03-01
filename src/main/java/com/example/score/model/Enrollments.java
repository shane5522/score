package com.example.score.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(EnrollmentId.class)
public class Enrollments {
    @Id
    @ManyToOne
    @JoinColumn(name="id")
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name="id")
    private Subject subject;

    private Date year;

    private int semester;

    private String grade;

    private float gradePoint;
}
