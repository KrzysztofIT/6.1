package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double side;

    public Circle(double side) {
        this.side = side;
    }

    public String getShapeName(){
        return "Circle";
    }
    public double getField(){
        return 0 ;
    }
}
