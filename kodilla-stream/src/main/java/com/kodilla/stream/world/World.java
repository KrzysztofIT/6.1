package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> continents = new ArrayList<>();

    public void addItem(Continent item) {
        continents.add(item);
    }

    public boolean removeItem(Continent item) {
        return continents.remove(item);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal peoplequantity =
                continents.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum , current) -> sum = sum.add(current));
        return peoplequantity;
    }
}
