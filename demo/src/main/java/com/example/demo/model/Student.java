package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos") // collection name in MongoDB
public class Student {

    @Id
    private String id; // MongoDB ID is String/ObjectId
    private String name;
    private String department;

    // No-arg constructor
    public Student() {
    }

    // All-args constructor
    public Student(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
