package com.vishakan.properties.inherence;

public class boxweight extends box {
    double weight;
    boxweight()
    {
        this.weight=-1;
    }
    boxweight(double l,double h,double w,double weight)
    {
        super(l,h,w);
        System.out.println(super.weight);
        this.weight=weight;
    }
}
