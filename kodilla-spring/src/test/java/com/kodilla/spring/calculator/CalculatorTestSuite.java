package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum") ;

        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(5,4);
        double sub = calculator.sub(5,4);
        double mul = calculator.mul(5,4);
        double div = calculator.div(5,4);


        //String userName = forumUser.getUsername();

        //Then
        //Assert.assertEquals(90 , add);
        //Assert.assertEquals( "John Smith",  userName);
    }
}
