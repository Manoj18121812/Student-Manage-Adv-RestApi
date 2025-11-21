package com.example.Student_Manage_Adv.repository;

import com.example.Student_Manage_Adv.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findByCity(String city);
    List<Student> findByNameContaining(String namePart);
    List<Student> findByMarksGreaterThan(double marks);
    List<Student> findByMarksLessThan(double marks);

}
