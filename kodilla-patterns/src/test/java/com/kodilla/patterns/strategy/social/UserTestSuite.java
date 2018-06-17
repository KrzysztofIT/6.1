package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millenials = new Millenials("millenials");
        User ygeneration = new YGeneration("ygeneration");
        User zgeneration = new ZGeneration("zgeneration");

        //When
        String millenialsPublisher = millenials.getSocialPublisher();
        String zgenerationPublisher = zgeneration.getSocialPublisher();
        String ygenerationPublisher = ygeneration.getSocialPublisher();

        //Then
        Assert.assertEquals( "Facebook", millenialsPublisher);
        Assert.assertEquals( "Snapchat", ygenerationPublisher);
        Assert.assertEquals( "Twitter", zgenerationPublisher);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User millenials = new Millenials("millenials");

        //When
        millenials.setSocialPublisher(new TwitterPublisher());
        String millenialsPublisher = millenials.getSocialPublisher();

        //Then
        Assert.assertEquals( "Twitter", millenialsPublisher);
    }
}
