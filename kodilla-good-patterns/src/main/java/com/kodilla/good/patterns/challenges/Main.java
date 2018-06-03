package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*MovieStore movies =  new MovieStore();
        String tmp = movies.getMovies().entrySet().stream()
                    .flatMap( entry -> entry.getValue().stream())
                    .collect(Collectors.joining("!"));
        System.out.println(tmp);*/


        OrderRequestRetriever retriever = new OrderRequestRetriever();
        OrderRequest request = retriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new SmsService() , new CarOrderService() , new CarOrderRepository());
        productOrderService.process(request);
    }
}


