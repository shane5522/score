package com.example.score.controller;

import com.example.score.dto.StudentRequestDto;
import com.example.score.model.Enrollment;
import com.example.score.model.Student;
import com.example.score.model.Subject;
import com.example.score.service.EnrollmentService;
import com.example.score.service.StudentService;
import com.example.score.service.SubjectService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;
    private final SubjectService subjectService;
    private final EnrollmentService enrollmentService;

    public StudentController(StudentService service, SubjectService subjectService, EnrollmentService enrollmentService) {
        this.studentService = service;
        this.subjectService = subjectService;
        this.enrollmentService = enrollmentService;
    }

    //학생 추가
    @GetMapping("/write")
    public String editPage(){
        return "write";
    }

    @PostMapping("/write")
    public String writeStudent(@ModelAttribute StudentRequestDto.Write dto){
        Student student = dto.toEntity();
        studentService.save(student);
        return "redirect:/";
    }

    //성적 조회
    @GetMapping("/content")
    public String content(@RequestParam Long id, Model model){
        Student student = studentService.getStudent(id);
        List<Enrollment> enrollments = enrollmentService.getEnrollmentByStudentId(student);
        model.addAttribute("student", student);
        model.addAttribute("enrollments", enrollments);
        return "content";
    }
}