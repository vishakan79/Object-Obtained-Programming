package com.vishakan.properties.polymorphism;
class triangle extends rectangle
{
    void area()
    {
        System.out.println("it is has the three sides");
    }
}
class rectangle extends circle
{
    void area()
    {
        System.out.println("it is rectangle it has the different four sides");
    }
}
class circle extends shapes
{
    void area()
    {
        System.out.println("it is circle is has no sides");
    }
}
class shapes
{
    void area()
    {
        System.out.println("it is main body of the shapes");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        shapes circle = new circle();
        circle.area();
    }
}
