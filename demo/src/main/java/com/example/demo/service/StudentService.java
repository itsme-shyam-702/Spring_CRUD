package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    // CREATE
    public Student addStudent(Student student) {
        return repo.save(student); // ✅ return the saved Student
    }

    // UPDATE
    public Student updateStudent(Student student) {
        return repo.save(student); // ✅ save automatically updates if ID exists
    }

    // READ ALL
    public List<Student> getAllStudent() {
        return repo.findAll();
    }

    // DELETE
    public void deleteStudent(String id) {
        repo.deleteById(id); // ✅ ID is String for MongoDB
    }
}


