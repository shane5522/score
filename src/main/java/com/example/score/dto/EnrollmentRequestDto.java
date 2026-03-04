package com.example.score.dto;

import com.example.score.model.Enrollment;
import com.example.score.model.Student;
import com.example.score.model.Subject;
import lombok.*;

public class EnrollmentRequestDto {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class EnrollmentUpdateDto {
        private String year;
        private String semester;
        private String subjectId;
        private String name;
        private int credit;
        private int earnedCredits;
        private String subjectGrade;
        private double gradePoint;

        public Enrollment toEntity(){
            return Enrollment.builder()
                    .year(year)
                    .semester(semester)
                    .earnedCredits(earnedCredits)
                    .subjectGrade(subjectGrade)
                    .gradePoint(gradePoint)
                    .build();
        }
    }
}
