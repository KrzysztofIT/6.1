package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InfoService infoService;
    private OrderService orderService;
    private OrderRepository orderrepository;

    public ProductOrderService(final InfoService infoService, final OrderService orderService, final OrderRepository orderrepository) {
        this.infoService = infoService;
        this.orderService = orderService;
        this.orderrepository = orderrepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrder = orderService.order(orderRequest.getUser(),orderRequest.getFrom(),orderRequest.getTo());

        if(isOrder){
            infoService.inform(orderRequest.getUser());
            orderrepository.createOrder(orderRequest.getUser(),orderRequest.getFrom(),orderRequest.getTo());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), true);
        }
    }
}
