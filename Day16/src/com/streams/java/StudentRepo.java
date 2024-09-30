package com.streams.java;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {


    private List<Student> studentList;

    public StudentRepo() {
        this.studentList = new ArrayList<>();
        studentList.add(new Student("John Doe", "Engineering", "Computer Science", 101));
        studentList.add(new Student("Jane Smith", "Engineering", "Mechanical", 102));
        studentList.add(new Student("Alice Johnson", "Science", "Physics", 103));
        studentList.add(new Student("Bob Brown", "Engineering", "Electrical", 104));
        studentList.add(new Student("Charlie Williams", "Arts", "History", 105));
        studentList.add(new Student("David Lee", "Business", "Finance", 106));
        studentList.add(new Student("Emily Davis", "Engineering", "Civil", 107));
        studentList.add(new Student("Frank Harris", "Science", "Chemistry", 108));
        studentList.add(new Student("Grace Clark", "Engineering", "Information Technology", 109));
        studentList.add(new Student("Henry Wilson", "Science", "Mathematics", 110));

    }
  public List<Student>studentInfo(){
      return this.studentList;
  }
}








