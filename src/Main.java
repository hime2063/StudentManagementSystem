import models.Classroom;
import models.Bill;
import models.Student;
import models.Subject;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<Bill> bills = new ArrayList<>();


        Classroom c1 = new Classroom(101, "Khumbila", 26, false, true, "Mohan Pradhan");
        Classroom c2 = new Classroom(102, "Lobuche", 26, false, true, "Aakash  Giri");
        Classroom c3 = new Classroom(103, "Yala", 26, true, true, "Bishnu Pandey");

        Subject s1 = new Subject(1, "Math", 100, "Mohan Pradhan", 35, 4);
        Subject s2 = new Subject(2, "Physics", 100, "Aakash  Giri", 35, 4);
        Subject s3 = new Subject(3, "Java", 100, "Prayush Shrestha", 35, 4);

        subjects.add(s1);
        subjects.add(s2);
        subjects.add(s3);

        Bill b1 = new Bill(19500, 0, "2024/09/11");
        Bill b2 = new Bill(19500, 0, "2024/10/12");
        Bill b3 = new Bill(19500, 0, "2024/11/13");

        bills.add(b1);
        bills.add(b2);
        bills.add(b3);

        Student ss1 = new Student("Himanshu Gautam", 25034, 12, "Khumbila", c1, subjects, bills);
        Student ss2 = new Student("Sudamshu Gautam", 25012, 12, "Lobuche", c2, subjects, bills);
        Student ss3 = new Student("Yunish", 25086 , 12 , "Lobuche ", c3 , subjects, bills);

        print(ss1);
        print(ss2);
        print(ss3);
    }

    private static void print(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNo());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Section: " + student.getSection());
        System.out.println("Classroom: " + student.getClassroom().getClassroomId());
        System.out.println("Class Teacher: " + student.getClassroom().getClassTeacher());
        System.out.println("Subjects:");
        printSubject(student.getSubjects());
        System.out.println("Bills:");
        printBillDetails(student.getBills());
        System.out.println("Total Fees: " + student.Feess());
        System.out.println();
    }

    private static void printSubject(ArrayList<Subject> subjects) {
        if (subjects.size() > 0) {
            System.out.println(subjects.get(0).getName() + " : " + subjects.get(0).getTeacher() );
        }
        if (subjects.size() > 1) {
            System.out.println(subjects.get(1).getName() + " : " + subjects.get(1).getTeacher());
        }
        if (subjects.size() > 2) {
            System.out.println(subjects.get(2).getName() + " : " +  subjects.get(2).getTeacher());
        }
    }

    private static void printBillDetails(ArrayList<Bill> bills) {
        if (bills.size() > 0) {
            System.out.println("Amount: " + bills.get(0).getFees() + " Date: " + bills.get(0).getDate());
        }
        if (bills.size() > 1) {
            System.out.println("Amount: " + bills.get(1).getFees() + " Date: " + bills.get(1).getDate());
        }
        if (bills.size() > 2) {
            System.out.println("Amount: " + bills.get(2).getFees() + " Date: " + bills.get(2).getDate());
        }
    }
}