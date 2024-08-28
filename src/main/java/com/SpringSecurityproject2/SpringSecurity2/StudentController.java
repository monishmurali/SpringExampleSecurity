package com.SpringSecurityproject2.SpringSecurity2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"monish","Java"),
            new Student(2,"Asish","java script")
    ));

   @GetMapping("students")
    public List<Student> getStudents()
   {
       return students;
   }
   @PostMapping("students")
   public void addStudent(@RequestBody Student student)
   {
       students.add(student);

   }
}
