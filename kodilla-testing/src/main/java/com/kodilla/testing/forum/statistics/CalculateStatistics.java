package com.kodilla.testing.forum.statistics;


public class CalculateStatistics {
    int usersCount;
    int postsCount;
    int commentsCount;

    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0) {
            avgPostsPerUser = (double) postsCount / usersCount;
        }else {
            avgPostsPerUser = 0;
        }
        if (usersCount != 0) {
            avgCommentsPerUser = (double) commentsCount / usersCount;
        }else{
            avgCommentsPerUser = 0;
        }
        if (postsCount != 0) {
            avgCommentsPerPost = (double) commentsCount / postsCount;
        }else{
            avgCommentsPerPost = 0;
        }
    }
}
