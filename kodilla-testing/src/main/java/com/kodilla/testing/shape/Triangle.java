package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double side;
    public Triangle(double side) {
        this.side = side;
    }
    public String getShapeName(){
        return "Triangle";
    }
    public double getField(){
        return 0 ;
    }
}
