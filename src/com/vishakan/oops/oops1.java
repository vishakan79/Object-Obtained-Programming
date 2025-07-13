package com.vishakan.oops;
class Student
{
    int rollno;
    String name;
    float Marks;
}

public class oops1 {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.rollno=23;
        student1.name="vishakan";
        student1.Marks=79.0f;
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.Marks);
    }

}
