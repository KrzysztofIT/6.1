package com.kodilla.testing.shape;
import org.junit.*;
import  com.kodilla.testing.com.kodilla.testing.shape.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddShape() {
        //Given
        ShapeCollector shapeColl = new ShapeCollector();
        Square square = new Square(3.0);
        //When
        shapeColl.addFigure(square);

        //Then
        Assert.assertEquals(square ,shapeColl.getFigure(0));
    }
    
    @Test
    public void testRemoveShape() {
        //Given
        ShapeCollector shapeColl = new ShapeCollector();
        Square square = new Square(3.0);
        //When
        shapeColl.addFigure(square);
        shapeColl.removeFigure(0);
        //Then
        Assert.assertEquals(shapeColl.getColl().isEmpty(),true );
    }
}

