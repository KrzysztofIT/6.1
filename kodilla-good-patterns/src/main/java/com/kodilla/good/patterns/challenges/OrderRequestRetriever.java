package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Kamil" , "Kowalski");
        LocalDateTime orderfrom = LocalDateTime.of(2016 ,1 , 2,14,0);
        LocalDateTime orderto = LocalDateTime.of(2015 ,12 , 22,4,0);

        return new OrderRequest(user,orderfrom,orderto);

    }
}
