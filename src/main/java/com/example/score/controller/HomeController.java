package com.example.score.controller;

import com.example.score.dto.StudentRequestDto;
import com.example.score.model.Student;
import com.example.score.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    private final StudentService service;

    public HomeController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model){
        List<Student> studentList = service.getList();

        model.addAttribute("students", studentList);
        return "home";
    }
}