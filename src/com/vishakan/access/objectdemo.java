package com.vishakan.access;

public class objectdemo {
    int num;
    public objectdemo(int num) {
        this.num=num;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

    }

    public static void main(String[] args) {
        objectdemo obj1= new objectdemo(34);
        objectdemo obj2= obj1;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
