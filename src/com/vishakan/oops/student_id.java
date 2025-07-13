package com.vishakan.oops;

class studentData
{
    int rollno;
    String name;
    float marks;
    studentData()
    {
        // it is internally refer to construtor this ref class
        this(0,"default.person",0.0f);
    }
    studentData(int rollno,String name,float marks) // construtor when the run the code it can locate the data or memory for assign
    {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(marks);
    }
}
public class student_id {
    public static void main(String[] args) {
        studentData student1= new studentData(10,"vishakan",90.1f);
        studentData student2= new studentData(02,"balaji",97.2f);
        student1.display();
        student2.display();
        studentData random = new studentData();
        random.display();
        studentData one = new studentData();
        studentData two = one;
        one.name="vinoth kumar";
        System.out.println(two.name);// it can point the same object ref point
    }
}
