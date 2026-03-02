package com.example.score.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.context.annotation.Configuration;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subject {
    public Subject(String subjectId, String name, int credit){
        this.subjectId = subjectId;
        this.name = name;
        this.credit = credit;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String subjectId;

    private String name;

    private int credit;
}
