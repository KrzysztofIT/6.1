package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost (){
        //Given
        Pizza thepizza = new BasicPizza();
        //When
        BigDecimal calculatedCost = thepizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(5), calculatedCost);

    }

    @Test
    public void testBasicPizzaGetDescription (){
        //Given
        Pizza thepizza = new BasicPizza();
        //When
        String description = thepizza.getDescription();
        //Then
        Assert.assertEquals("This is a pizza", description);
    }

    @Test
    public void testDoubleDoughPizzaGetCost (){
        //Given
        Pizza thepizza = new BasicPizza();
        thepizza = new DoubleDoughDecorator(thepizza);

        //When
        BigDecimal calculatedCost = thepizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(10), calculatedCost);

    }

    @Test
    public void testDoubleDoughPizzaGetDescription (){
        //Given
        Pizza thepizza = new BasicPizza();
        thepizza = new DoubleDoughDecorator(thepizza);

        //When
        String description = thepizza.getDescription();
        //Then
        Assert.assertEquals("This is a pizza with double dough", description);
    }

    @Test
    public void testStandardDoughPizzaGetCost (){
        //Given
        Pizza thepizza = new BasicPizza();
        thepizza = new StandardDoughDecorator(thepizza);

        //When
        BigDecimal calculatedCost = thepizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(7), calculatedCost);

    }

    @Test
    public void testStandardDoughPizzaGetDescription (){
        //Given
        Pizza thepizza = new BasicPizza();
        thepizza = new StandardDoughDecorator(thepizza);

        //When
        String description = thepizza.getDescription();
        //Then
        Assert.assertEquals("This is a pizza with standard dough", description);
    }

    @Test
    public void testSalamiPizzaGetCost (){
        //Given
        Pizza thepizza = new BasicPizza();
        thepizza = new SalamiDecorator(thepizza);

        //When
        BigDecimal calculatedCost = thepizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(8), calculatedCost);

    }

    @Test
    public void testSalamiPizzaGetDescription (){
        //Given
        Pizza thepizza = new BasicPizza();
        thepizza = new SalamiDecorator(thepizza);

        //When
        String description = thepizza.getDescription();
        //Then
        Assert.assertEquals("This is a pizza with salami", description);
    }

    @Test
    public void testMushroomsPizzaGetCost (){
        //Given
        Pizza thepizza = new BasicPizza();
        thepizza = new MushroomsDecorator(thepizza);

        //When
        BigDecimal calculatedCost = thepizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(9), calculatedCost);

    }

    @Test
    public void testMushroomsPizzaGetDescription (){
        //Given
        Pizza thepizza = new BasicPizza();
        thepizza = new MushroomsDecorator(thepizza);

        //When
        String description = thepizza.getDescription();
        //Then
        Assert.assertEquals("This is a pizza with mushrooms", description);
    }
}
