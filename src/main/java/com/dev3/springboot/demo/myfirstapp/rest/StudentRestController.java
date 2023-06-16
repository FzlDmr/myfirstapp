package com.dev3.springboot.demo.myfirstapp.rest;

import com.dev3.springboot.demo.myfirstapp.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    //define @PostConstruct to load the student data ... only once
    public void loadData(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima","Patal"));
        theStudents.add(new Student("Mario","Rossi"));
        theStudents.add(new Student("Mary","Smith"));
    }

    @GetMapping("/students/{studentsId}")
    public Student getStudent(@PathVariable int studentId){
        return theStudents.get(studentId);
    }
}
