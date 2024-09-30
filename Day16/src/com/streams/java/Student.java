package com.streams.java;

import java.util.Objects;

public class Student {

    private String sName;
    private String sBranch;
    private  String department;
    private double rollNumber;

    public Student(String sName, String sBranch, String department, double rollNumber) {
        this.sName = sName;
        this.sBranch = sBranch;
        this.department = department;
        this.rollNumber = rollNumber;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsBranch() {
        return sBranch;
    }

    public void setsBranch(String sBranch) {
        this.sBranch = sBranch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(double rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(rollNumber, student.rollNumber) == 0 && Objects.equals(sName, student.sName) && Objects.equals(sBranch, student.sBranch) && Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sName, sBranch, department, rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sBranch='" + sBranch + '\'' +
                ", department='" + department + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
