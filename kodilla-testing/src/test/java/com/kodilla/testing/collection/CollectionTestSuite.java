package com.kodilla.testing.forum;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseEmptyArray(){
        //Given
        ArrayList<Integer> tmp = null;

        OddNumbersExterminator test1 = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = test1.exterminate(null);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(null, result);
    }
    @Test
    public void testCaseFullArray(){
        //Given
        ArrayList<Integer> tmp2 = new ArrayList<>();
        tmp2.add(3);
        tmp2.add(2);

        ArrayList<Integer> tmp1 = new ArrayList<>();
        tmp1.add(2);


        OddNumbersExterminator test1 = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = test1.exterminate(tmp2);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(tmp1, result);
    }

}