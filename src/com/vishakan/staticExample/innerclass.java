package com.vishakan.staticExample;


public class innerclass {
     static class test
    {
        String name;
        test(String name)
        {
            this.name=name;
        }
    }


    public static void main(String[] args) {
        test obj = new test("vishakan");
        test obj2 =new test("rahul");
        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}
