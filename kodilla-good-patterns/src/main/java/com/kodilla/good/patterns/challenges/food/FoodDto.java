package com.kodilla.good.patterns.challenges.food;

public class FoodDto {
    Provider provider;
    boolean isOrder;

    public FoodDto(Provider provider, boolean isOrder) {
        this.provider = provider;
        this.isOrder = isOrder;
    }

    public Provider getProvider() {
        return provider;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
