package com.vishakan.staticExample;

public class staticexample {
    static int a=4;
    static int b;
    static
    {
        // when the code can loaded it can created
        System.out.println("hi evryone");
        b=a*5;
    }
    public static void main(String[] args) {
       staticexample obj = new staticexample();
        staticexample obj2 = new staticexample();
        System.out.println(obj.a +" "+obj.b);
        System.out.println(obj2.a +" "+obj2.b);
    }
}
