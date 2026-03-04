package com.example.score.dto;

import com.example.score.model.Subject;
import lombok.*;

public class SubjectDto {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class SubjectUpdateDto {
        private String subjectId;
        private String name;
        private int credit;

        public Subject toEntity(){
            return Subject.builder()
                    .subjectId(subjectId)
                    .name(name)
                    .credit(credit)
                    .build();
        }
    }
}
