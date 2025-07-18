package com.vishakan.properties.polymorphism;
//polymorsiphm is act as many ways to act the behaivour it has seen the code is method overloading
class addtion
{
     int sum(int a,int b)
    {
       return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    int sum()
    {
        return -1;
    }
}
public class method_overloading {
    public static void main(String[] args) {
       addtion add = new addtion();
        System.out.println(add.sum());
    }
}
