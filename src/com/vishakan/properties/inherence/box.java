package com.vishakan.properties.inherence;

public class box {
    double l;
    double h;
    double w;
    double weight;
    box()
    {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    box(double sides)
    {
        this.l=sides;
        this.w=sides;
        this.h=sides;
    }
    box(double l,double h,double w)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }
    box(box old)
    {
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;

    }
}
