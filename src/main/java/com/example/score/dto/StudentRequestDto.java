package com.example.score.dto;

import com.example.score.model.Student;
import lombok.*;

import java.time.LocalDate;

public class StudentRequestDto {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Write{
        private Long id;
        private String name;
        private String engName;
        private String major;
        private String phone;
        private String gender;
        private LocalDate birth;
        private String className;
        private String address;

        public Student toEntity(){
            return Student.builder()
                    .studentId(id)
                    .name(name)
                    .engName(engName)
                    .major(major)
                    .phone(phone)
                    .gender(gender)
                    .birth(birth)
                    .className(className)
                    .address(address)
                    .build();
        }
    }
}
