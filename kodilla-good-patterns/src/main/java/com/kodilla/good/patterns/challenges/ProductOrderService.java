package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InfoService infoservice;
    private OrderService orderservice;
    private OrderRepository orderrepository;

    public ProductOrderService(final InfoService infoservice, final OrderService orderservice, final OrderRepository orderrepository) {
        this.infoservice = infoservice;
        this.orderservice = orderservice;
        this.orderrepository = orderrepository;
    }

    public Object /*OrderDto*/ process(){ //kaszana z typem
        boolean isOrder = false;


        if(isOrder){
            infoservice.inform();// tutaj ma byc user w argumencie
            orderrepository.createOrder();//tutaj tez ma byc user w argumencie
            return new Object();
        } else {
            return new Object();
        }


    }
}
