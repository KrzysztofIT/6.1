package com.kodilla.good.patterns.challenges.food;

public class GlutenFreeShop implements FoodService {
    @Override
    public boolean process(Provider provider){
        System.out.println("Gluten FREE");
        return true;
    }
}
