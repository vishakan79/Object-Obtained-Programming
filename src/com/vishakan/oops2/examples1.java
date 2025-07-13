package com.vishakan.oops2;

class A
{
    String name;
    int num;
    A(String name,int num)
    {
        this.name=name;
        this.num=num;
    }

}
public class examples1 {
    public static void main(String[] args) {
       A obj = new A("vishakan",15);
        System.out.println(obj);
    }
}

