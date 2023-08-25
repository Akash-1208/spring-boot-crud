package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Controller
public class HomeController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/index")
    public String index() {
        System.out.println("Hello index");
        return "index.jsp";
    }
    @RequestMapping("/operations")
    public String operations(String operation) {
        System.out.println("Hello"+operation);
        return operation+".jsp";
    }

    @PostMapping("/register")

    public String UserRegister(@ModelAttribute Student student, Model model) {
        System.out.println("Hello Register");
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getCity());
        System.out.println(student.getCollege());
         this.studentRepository.save(student);
        System.out.println("Data Entered into Database");
        return "registered.jsp";

    }

    // @PostMapping("/delete")
    // public String delString(String op) {
    //     System.out.println(op);
    //     System.out.println("This is inside delete function");
    //     return "registered.jsp";
    // }

    @RequestMapping({ "/get" })
    public ResponseEntity<?> getStudents() {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }

    @RequestMapping( "/delete" )
    public String delete() {
        System.out.println("Deleted all records");
        this.studentRepository.deleteAll();
        return "registered.jsp";
    }

}