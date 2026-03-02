package com.example.score.config;

import com.example.score.model.Enrollment;
import com.example.score.model.Student;
import com.example.score.model.Subject;
import com.example.score.repository.EnrollmentRepository;
import com.example.score.repository.StudentRepository;
import com.example.score.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
@RequiredArgsConstructor
public class InitialDataConfig {

    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;
    private final EnrollmentRepository enrollmentRepository;

    @Bean
    public CommandLineRunner initData(){
        return args -> {
            // 이미 데이터 있으면 종료 (안전장치)
            if(studentRepository.count() > 0){
                return;
            }

            // student 초기 데이터
            Student s1 = new Student(2506075L, "김준서", "JUNSEO KIM", LocalDate.of(2003, 5, 2), "남", "컴퓨터 소프트웨어학과", "01095391088", "2학년", "C", "경기도 성남시 수정구 희망로 531 304동 1704호 (신흥동, 산성역자이푸르지오 3단지)");
            Student s2 = new Student(2206002L, "김태연", "TAEYEON KIM", LocalDate.of(2003, 12, 31), "남", "컴퓨터 소프트웨어학과", "01012345678", "2학년", "A", "서울특별시 강남구");
            Student s3 = new Student(119L, "김민서", "GENERAL KING MINSEO", LocalDate.of(1, 1, 1), "남", "대통령학과", "119", "3학년", "1", "청와대");

            studentRepository.save(s1);
            studentRepository.save(s2);
            studentRepository.save(s3);

            // subject 초기 데이터
            Subject sub1 = new Subject("06007", "웹프로그래밍기초", 3);
            Subject sub2 = new Subject("06309", "시스템분석및설계", 2);
            Subject sub3 = new Subject("06728", "C언어(1)", 3);
            Subject sub4 = new Subject("68364", "취창업진로지도", 1);
            Subject sub5 = new Subject("69127", "컴퓨터와정보", 2);
            Subject sub6 = new Subject("69128", "상담(1)", 1);
            Subject sub7 = new Subject("70007", "비주얼베이직", 3);
            Subject sub8 = new Subject("70008", "소프트웨어기초", 3);
            Subject sub9 = new Subject("001023", "문제해결과사고력", 2);
            Subject sub10 = new Subject("06705", "ASP", 3);
            Subject sub11 = new Subject("06729", "C언어(2)", 3);
            Subject sub12 = new Subject("68365", "파이썬", 3);
            Subject sub13 = new Subject("68366", "JAVASCRIPT", 3);
            Subject sub14 = new Subject("69295", "상담(2)", 1);
            Subject sub15 = new Subject("70346", "데이터베이스기초", 2);
            Subject sub16 = new Subject("70347", "운영체제기초", 3);
            Subject sub17 = new Subject("00040", "의사소통기법", 2);

            subjectRepository.save(sub1);
            subjectRepository.save(sub2);
            subjectRepository.save(sub3);
            subjectRepository.save(sub4);
            subjectRepository.save(sub5);
            subjectRepository.save(sub6);
            subjectRepository.save(sub7);
            subjectRepository.save(sub8);
            subjectRepository.save(sub9);
            subjectRepository.save(sub10);
            subjectRepository.save(sub11);
            subjectRepository.save(sub12);
            subjectRepository.save(sub13);
            subjectRepository.save(sub14);
            subjectRepository.save(sub15);
            subjectRepository.save(sub16);
            subjectRepository.save(sub17);

            //Enrollment 초기 데이터
            Enrollment e1 = new Enrollment(studentRepository.findById(2506075L).orElseThrow(()->new RuntimeException("학생 없음")), subjectRepository.findById(1L).orElseThrow(()->new RuntimeException("과목 없음")), "2025학년도", "1학기", 3, "P", 0.0);
            Enrollment e2 = new Enrollment(studentRepository.findById(2506075L).orElseThrow(()->new RuntimeException("학생 없음")), subjectRepository.findById(2L).orElseThrow(()->new RuntimeException("과목 없음")), "2025학년도", "1학기", 2, "A+", 4.5);

            enrollmentRepository.save(e1);
            enrollmentRepository.save(e2);
        };
    }
}
