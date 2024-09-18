package models;

import java.util.ArrayList;

public class Student {
    private String name;
    private int rollNo;
    private int grade;
    private String section;
    private Classroom classroom;
    private ArrayList<Subject> subjects;
    private ArrayList<Bill> bills;

    public Student(String name, int rollNo, int grade, String section, Classroom classroom, ArrayList<Subject> subjects, ArrayList<Bill> bills) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        this.section = section;
        this.classroom = classroom;
        this.subjects = subjects;
        this.bills = bills;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public double Feess() {
        double totalFees = 0;
        for (Bill bill : bills) {
            totalFees += bill.getFees();
        }
        return totalFees;
    }
}