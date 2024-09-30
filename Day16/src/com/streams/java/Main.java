package com.streams.java;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentRepo studentRepo;
        studentRepo = new StudentRepo();
        StudentService studentService;
        studentService = new StudentService(studentRepo);

        List<Student> studentList= studentService.studentInfo();

        studentList.forEach(System.out::println);

        studentService.getRoll(105).forEach(System.out::println);
    }
}
