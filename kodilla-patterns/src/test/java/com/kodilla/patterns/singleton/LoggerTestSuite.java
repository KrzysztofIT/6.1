package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void openSettingsFile() {
        Logger.getInstance().getLastLog();
    }

    @AfterClass
    public static void closeSettingsFile() {
        Logger.getInstance().getLastLog();
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("First log");

        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("First log", log);
    }
}
