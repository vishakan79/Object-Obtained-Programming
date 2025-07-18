package com.vishakan.properties.inherence;

public class boxprice extends boxweight{
    double cost;
    boxprice(double cost)
    {
       this.cost=cost;
    }
    boxprice(boxprice other)
    {
        this.cost=other.cost;
    }
    boxprice(double side,double weight,double cost)
    {
        super(side,weight);
        this.cost=cost;
    }
}
