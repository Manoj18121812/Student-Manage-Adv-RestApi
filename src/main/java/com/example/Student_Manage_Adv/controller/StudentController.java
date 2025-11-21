package com.example.Student_Manage_Adv.controller;

import com.example.Student_Manage_Adv.entity.Student;
import com.example.Student_Manage_Adv.service.StudentService;
import jdk.jfr.Category;
import org.hibernate.annotations.ConcreteProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
    return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(Integer id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student update (@PathVariable Integer id,@RequestBody Student student){
    return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public String delete (@PathVariable Integer id){
    boolean ok = studentService.deleteStudent(id);
    return ok ? "deleted" : "not deleted";
    }

    //Extra Api

    @GetMapping("/city/{city}")
    public List<Student> getByCity(String city){
        return studentService.getByCity(city);
    }

    @GetMapping("/search/{name}")
    public List<Student> searchByName(@PathVariable String  name){
    return studentService.getByName(name);
    }

    @GetMapping("/count")
    public long CountStudents(){
        return studentService.countStudents();
    }

    @GetMapping("/marks/greater/{value}")
    public List<Student> getMarksGreater(@PathVariable double value) {
        return studentService.findByMarksGreaterThan(value);
    }

    @GetMapping("/marks/less/{value}")
    public List<Student> getMarksLess(@PathVariable double value) {
        return studentService.findByMarksLessThan(value);
    }
}
