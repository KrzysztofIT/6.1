package com.kodilla.testing.forum.statistics;




import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    public void test_avgPostsPerUser_1() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(0);
        when(stats.commentsCount()).thenReturn(5);
        when(stats.usersNames()).thenReturn(new ArrayList<>());

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgPostsPerUser = calcStats.avgPostsPerUser;

        //Then
        Assert.assertEquals(0, avgPostsPerUser,0.001);
    }
    @Test
    public void test_avgPostsPerUser_2() {
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        list.add("Tom");
        when(stats.postsCount()).thenReturn(0);
        when(stats.commentsCount()).thenReturn(5);
        when(stats.usersNames()).thenReturn(list);

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgPostsPerUser = calcStats.avgPostsPerUser;

        //Then
        Assert.assertEquals(0, avgPostsPerUser,0.001);
    }
    @Test
    public void test_avgPostsPerUser_3() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(100);
        when(stats.commentsCount()).thenReturn(5);
        when(stats.usersNames()).thenReturn(new ArrayList<>());

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgPostsPerUser = calcStats.avgPostsPerUser;

        //Then
        Assert.assertEquals(0, avgPostsPerUser,0.001);
    }

    @Test
    public void test_avgPostsPerUser_4() {
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        list.add("Tom");
        when(stats.postsCount()).thenReturn(1000);
        when(stats.commentsCount()).thenReturn(5);
        when(stats.usersNames()).thenReturn(list);

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgPostsPerUser = calcStats.avgPostsPerUser;

        //Then
        Assert.assertEquals(1000, avgPostsPerUser,0.001);
    }
    @Test
    public void test_avgPostsPerUser_5() {
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Tom2");
        when(stats.postsCount()).thenReturn(1);
        when(stats.commentsCount()).thenReturn(5);
        when(stats.usersNames()).thenReturn(list);

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgPostsPerUser = calcStats.avgPostsPerUser;

        //Then
        Assert.assertEquals(0.5, avgPostsPerUser,0.001);
    }
    @Test
    public void test_avgCommentsPerPost_1() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(0);
        when(stats.commentsCount()).thenReturn(0);
        when(stats.usersNames()).thenReturn(new ArrayList<>());

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerPost = calcStats.avgCommentsPerPost;

        //Then
        Assert.assertEquals(0, avgCommentsPerPost,0.001);
    }
    @Test
    public void test_avgCommentsPerPost_2() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(3);
        when(stats.commentsCount()).thenReturn(0);
        when(stats.usersNames()).thenReturn(new ArrayList<>());

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerPost = calcStats.avgCommentsPerPost;

        //Then
        Assert.assertEquals(0, avgCommentsPerPost,0.001);
    }
    @Test
    public void test_avgCommentsPerPost_3() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(0);
        when(stats.commentsCount()).thenReturn(6);
        when(stats.usersNames()).thenReturn(new ArrayList<>());

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerPost = calcStats.avgCommentsPerPost;

        //Then
        Assert.assertEquals(0, avgCommentsPerPost,0.001);
    }
    @Test
    public void test_avgCommentsPerPost_4() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(10);
        when(stats.commentsCount()).thenReturn(2);
        when(stats.usersNames()).thenReturn(new ArrayList<>());

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerPost = calcStats.avgCommentsPerPost;

        //Then
        Assert.assertEquals(0.2, avgCommentsPerPost,0.001);
    }
    public void test_avgCommentsPerPost_5() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(10);
        when(stats.commentsCount()).thenReturn(30);
        when(stats.usersNames()).thenReturn(new ArrayList<>());
        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerPost = calcStats.avgCommentsPerPost;

        //Then
        Assert.assertEquals(3, avgCommentsPerPost,0.001);
    }


    @Test
    public void test_avgCommentsPerUser_1() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(4);
        when(stats.commentsCount()).thenReturn(0);
        when(stats.usersNames()).thenReturn(new ArrayList<>());

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerUser = calcStats.avgCommentsPerUser;

        //Then
        Assert.assertEquals(0, avgCommentsPerUser,0.001);
    }
    @Test
    public void test_avgCommentsPerUser_2() {
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        list.add("Tom");
        when(stats.postsCount()).thenReturn(2);
        when(stats.commentsCount()).thenReturn(0);
        when(stats.usersNames()).thenReturn(list);

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerUser = calcStats.avgCommentsPerUser;

        //Then
        Assert.assertEquals(0, avgCommentsPerUser,0.001);
    }
    @Test
    public void test_avgCommentsPerUser_3() {
        //Given
        Statistics stats = mock(Statistics.class);
        when(stats.postsCount()).thenReturn(100);
        when(stats.commentsCount()).thenReturn(5);
        when(stats.usersNames()).thenReturn(new ArrayList<>());

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerUser = calcStats.avgCommentsPerUser;

        //Then
        Assert.assertEquals(0, avgCommentsPerUser,0.001);
    }

    @Test
    public void test_avgCommentsPerUser_4() {
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        list.add("Tom");
        when(stats.postsCount()).thenReturn(1000);
        when(stats.commentsCount()).thenReturn(5);
        when(stats.usersNames()).thenReturn(list);

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerUser = calcStats.avgCommentsPerUser;

        //Then
        Assert.assertEquals(5, avgCommentsPerUser,0.001);
    }
    @Test
    public void test_avgCommentsPerUser_5() {
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Tom2");
        when(stats.postsCount()).thenReturn(1);
        when(stats.commentsCount()).thenReturn(1);
        when(stats.usersNames()).thenReturn(list);

        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);
        //When
        double avgCommentsPerUser = calcStats.avgCommentsPerUser;

        //Then
        Assert.assertEquals(0.5, avgCommentsPerUser,0.001);
    }
}
