package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //Given
        Country Poland = new Country(new BigDecimal("40000000"));
        Country France = new Country(new BigDecimal("50000000"));
        Country USA = new Country(new BigDecimal("400000000"));

        Continent Europe = new Continent();
        Europe.addItem(Poland);
        Europe.addItem(France);

        Continent America = new Continent();
        America.addItem(USA);

        World world = new World();
        world.addItem(Europe);
        world.addItem(America);

        //When
        BigDecimal totalPeopleQuantity = world.getContinents().stream()
                .flatMap(s -> s.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("490000000");
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
