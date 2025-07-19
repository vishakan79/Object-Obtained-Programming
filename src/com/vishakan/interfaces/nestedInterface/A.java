package com.vishakan.interfaces.nestedInterface;

public class A {
    public interface nestedinterface
    {
        boolean ofodd(int num);
    }
}
class B implements A.nestedinterface
{
    public boolean ofodd(int num)
    {
       return (num&1)==1;
    }
}
class main
{
    public static void main(String[] args) {
        B num = new B();
        boolean val=num.ofodd(3);
        System.out.println(val);
    }
}
