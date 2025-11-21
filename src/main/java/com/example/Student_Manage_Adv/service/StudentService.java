package com.example.Student_Manage_Adv.service;

import com.example.Student_Manage_Adv.entity.Student;
import com.example.Student_Manage_Adv.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo){
        this.repo=repo;
    }

    public Student addStudent(Student student){
        return repo.save(student);
    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public Student getStudentById(Integer id){
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(Integer id,Student newStudent){
        Student old = repo.findById(id).orElse(null);
        if(old==null){
            return null;
        }
        old.setName(newStudent.getName());
        old.setMarks(newStudent.getMarks());
        old.setAge(newStudent.getAge());
        old.setCity(newStudent.getCity());

        return repo.save(old);
    }

    public boolean deleteStudent(Integer id){
        if(!repo.existsById(id)){
            return false;
        }
        repo.deleteById(id);
        return true;
    }

    //this is extra feature upside all CRUD operation

    public List<Student> getByCity(String city){
       return  repo.findByCity(city);
    }

    public List<Student> getByName(String name){
       return repo.findByNameContaining(name);
    }

    public long countStudents(){
        return repo.count();
    }

    public List<Student> findByMarksGreaterThan(double marks){
        return repo.findByMarksGreaterThan(marks);
    }

    public List<Student> findByMarksLessThan(double marks){
        return repo.findByMarksLessThan(marks);
    }


}
