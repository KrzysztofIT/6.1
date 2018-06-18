package com.kodilla.good.patterns.challenges.food;



public class FoodOrderService {

    private InfoService infoService;
    private FoodService foodService;
    private FoodRepository foodRepository;

    public FoodOrderService(final InfoService infoService, final FoodService foodService, final FoodRepository foodRepository) {
        this.infoService = infoService;
        this.foodService = foodService;
        this.foodRepository = foodRepository;
    }

    public FoodDto process(final Provider provider){
        boolean isFoodOrder = foodService.process(provider);

        if (isFoodOrder){
            infoService.inform(provider);
            foodRepository.createOrder(provider);
            return new FoodDto(provider, true);
        } else {
            return new FoodDto(provider, false);
        }
    }
}
