package com.kodilla.good.patterns.challenges.food;

public class ExtraFoodShop implements FoodService {
    @Override
    public boolean process(Provider provider){
        System.out.println(provider.getName() +  " " + provider.getType() + " " + provider.getQuantity());
        return true;
    }
}
