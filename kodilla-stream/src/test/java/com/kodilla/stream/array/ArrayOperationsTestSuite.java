package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        //BookDirectory bookDirectory = new BookDirectory();
        int[] intArray = new int[5];
        //When
        //List<Book> books = bookDirectory.getList();
        intArray[0] = 3;
        intArray[1] = 5;
        intArray[2] = 7;
        intArray[3] = 9;
        intArray[4] = 11;
        //Then
        Assert.assertEquals(7 ,ArrayOperations.getAverage(intArray),0D);
    }
}
