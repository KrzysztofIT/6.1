package com.kodilla.good.patterns.challenges.food;

public class Provider {
    String name;
    double quantity;
    String type;

    public Provider(String name, double quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
}
