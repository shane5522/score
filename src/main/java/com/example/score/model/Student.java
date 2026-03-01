package com.example.score.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @Column(name="student_id")
    private Long id;

    private String name;

    private String engName;

    private LocalDate birth;

    private String gender;

    private String major;

    private String phone;

    private String className;

    private String address;
}
