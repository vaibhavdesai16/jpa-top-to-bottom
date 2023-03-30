package com.systemx.exjpa.controller;

import com.systemx.exjpa.entity.Student;
import com.systemx.exjpa.repository.StudentCriteria;
import com.systemx.exjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCriteria studentCriteria;
    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        System.out.println();
        studentRepository.save(student);
    }

    @GetMapping("/test")
    public void test(){
        studentCriteria.getStudentByCriteria();
    }

}
