package com.kodilla.good.patterns.challenges.food;


public class Main {
    public static void main(String[] args) {

    Provider provider = new Provider("ExtraFood",45.0 , "Eggs");
    FoodOrderService foodOrderService = new FoodOrderService( new SmsService() , new ExtraFoodShop() , new StandardFoodShopRepository());
    foodOrderService.process(provider);

    Provider provider2 = new Provider("GlutenFreeShop",10 , "Carrots");
    FoodOrderService foodOrderService2 = new FoodOrderService( new SmsService() , new GlutenFreeShop() , new StandardFoodShopRepository());
    foodOrderService2.process(provider2);

    }
}