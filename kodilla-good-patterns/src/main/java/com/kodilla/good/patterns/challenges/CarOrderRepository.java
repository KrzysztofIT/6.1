package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class CarOrderRepository implements OrderRepository{
    public void createOrder(User user, LocalDateTime from, LocalDateTime to){
        System.out.println("Insert to repo");
    }

}
