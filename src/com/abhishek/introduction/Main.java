package com.abhishek.introduction;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Student s1 = new Student();

        // new kayword dynamically allocates memory to the object and returns
        s1.name = "Abhishek";
        s1.rno = 10065;
        s1.marks = 9.17f;
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.marks);

        Student s2 = new Student(10068, "Divyanshu", 8.5f);
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.marks);
        s2.greet();

        Student s3 = s1;
        s3.rno = 10069;
        System.out.println(s1.rno);
        System.out.println(s3.rno);
        System.out.println(s3.name);
    }
}

class Student {
    int rno;
    String name;
    float marks;
    // Constructor of com.abhishek.introduction.Student Class
//    public Student(){
//        this.rno  = 0;
//        this.name = null;
//        this.marks = 0.0f;
//    }
    // Another constructor of com.abhishek.introduction.Student class but different from the first constructor
    public Student(int rno, String name, float marks){
        this.rno  = rno;
        this.name = name;
        this.marks = marks;
    }
    public void greet(){
        System.out.println("Hello " + this.name + ", Welcome to Apple !");
    }

    // OVERLOADING CONCEPT IN OOPs

    Student(){
        // Calling another constructor from a constructor
        this(13, "Adarsh", 9.0f);
    }

}

