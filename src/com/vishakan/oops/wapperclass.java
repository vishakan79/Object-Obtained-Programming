package com.vishakan.oops;

public class wapperclass {
    public static void main(String[] args) {
      final A names = new A("vishakan");
      names.name="balaji";
        System.out.println(names.name);
        // non primative value final connot be reassign the value
       //names =new A("object");

    }
}
class A
{
    String name;
    A(String name)
    {
        this.name=name;
    }
}
