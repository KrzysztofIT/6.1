package com.kodilla.testing.com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> list = new ArrayList<>();
    public void addFigure(Shape shape){
        list.add(shape);
    }
    public void removeFigure(int n){
        list.remove(n);
    }
    public Shape getFigure(int n){
        return list.get(n);
    }
    public ArrayList<Shape> getColl(){
        return list;
    }
    public void showFigures(){
        for(Shape shape: list){
            System.out.println(shape.getShapeName());
        }
    }
}
