package com.streams.java;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> studentInfo() {
        return this.studentRepo.studentInfo();
    }

    public List<Student> getRoll(double minRoll) {
        return this.studentRepo.studentInfo().stream()
                .filter(student -> student.getRollNumber() >= minRoll)
                .collect(Collectors.toList());


    }



    }
