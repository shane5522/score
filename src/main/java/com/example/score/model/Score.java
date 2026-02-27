package com.example.score.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Score {
    @Id
    private Long studentId;

    private String studentName;

    private String studentEngName;

    private Date studentBirth;

    private String studentGen;

    private String studentMajor;

    private int studentGradeLevel;

    private String studentClass;

    private String studentAddress;

    private String scoreSemester;

    private String scoreYear;

    private String subjectId;

    private String subjectName;

    private int subjectCredits;

    private int subjectECredits;

    private String subjectGrade;

    private float subjectScore;

    private int semesterCredits;

    private int semesterECredits;

    private int semesterClassCnt;

    private int semesterEClassCnt;

    private float semesterScoreSum;

    private float semesterScoreAvr;

    private float semesterPercentile;

    private int creditsSum;

    private int eCreditsSum;

    private int classCnt;

    private int eClassCnt;

    private float sum;

    private float avr;

    private float percentile;
}
