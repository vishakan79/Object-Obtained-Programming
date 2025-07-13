package com.vishakan.staticExample;

public class Main {
    public static void main(String[] args) {
        //human vishakan = new human("vishakan",19,80000,false);
        //human gopal= new human("nandhagopal",25,100000,true);
        //human balaji = new human("balaji",20,100000,true);
       // System.out.println(vishakan.age);
       // System.out.println(gopal.married);
        //System.out.println(vishakan.population);
        //System.out.println(gopal.population);
        //System.out.println(balaji.population);
        //System.out.println(human.population);
        Main obj =new Main();
        obj.greeting();

    }
    //we know the something requires the belong of instance
    void greeting()
    {
       fun();
    }
    // it is not depends on the instance
    static void fun()
    {
       // greeting();//but this refer the belong of instances
        //but it is using the function they can't deponds the instance
        Main obj = new Main();
        obj.greeting();
    }
}
