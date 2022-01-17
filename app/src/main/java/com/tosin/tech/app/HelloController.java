package com.tosin.tech.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired StudentRepository repo;
    @GetMapping
    public String sayHello() {
        return "Hello";
    }

    @PostMapping
    public String createStudent(Student student) {
        return repo.save(Student);
    }
}
