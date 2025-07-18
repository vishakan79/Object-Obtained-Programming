package com.vishakan.properties.inherence;

public class Main {
    public static void main(String[] args) {
      //  box box1= new box();
       // box box2= new box(box1);
       // System.out.println(box2.h);
      //  boxweight boxempty = new boxweight();
        //boxweight box1= new boxweight(2,3,4,5);
       // System.out.println(boxempty.weight);
       // System.out.println(box1.l+" "+box1.h+" "+box1.w+" "+box1.weight);
        //box boxref= new boxweight(2,3,4,5);
     //   System.out.println(boxref.w);
       // boxweight boxweightref = new box(2);
        // child class ref cannot access the parent class ref
        //but parent class access the child class
        boxprice box = new boxprice(5,10,20);
    }
}
