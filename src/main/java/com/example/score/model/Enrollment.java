package com.example.score.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(EnrollmentId.class)
public class Enrollment {
    @Id
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name="id")
    private Subject subject;

    private String year;

    private String semester;

    private int earnedCredits;

    private String subjectGrade;

    private Double gradePoint;
}
