package com.amazondemo.amazondemo.controller;

import com.amazondemo.amazondemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("")
    public Student getStudent(){
        return new Student("Ashenafi", "Kaleab");
    }
}
