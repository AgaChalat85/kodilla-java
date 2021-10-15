package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;;
    private int numberOfComments;
    private double avgNoOfPostsPerUser;
    private double avgNoOfCommentsPerUser;
    private double avgNoOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
            if(statistics.usersNames().size() == 0) {
              this.avgNoOfPostsPerUser = 0.0;
              this.avgNoOfCommentsPerUser = 0.0;
            } else {
              this.avgNoOfPostsPerUser = statistics.postsCount() / (double) statistics.usersNames().size();
              this.avgNoOfCommentsPerUser = statistics.commentsCount() / (double)statistics.usersNames().size();
            }
            if(statistics.postsCount() == 0) {
                this.avgNoOfCommentsPerPost = 0.0;
            } else {
                this.avgNoOfCommentsPerPost = statistics.commentsCount() / (double) statistics.postsCount();
            }
    }

    public void showStatistics() {
        System.out.println("----------- Forum Statistics -------------");
        System.out.println("Number of users: " + this.numberOfUsers);
        System.out.println("Number of posts: " + this.numberOfPosts);
        System.out.println("Number of comments: " + this.numberOfComments);
        System.out.println("Average number of posts per user: " + this.avgNoOfPostsPerUser);
        System.out.println("Average number of comments per user: " + this.avgNoOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + this.avgNoOfCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgNoOfPostsPerUser() {
        return avgNoOfPostsPerUser;
    }

    public double getAvgNoOfCommentsPerUser() {
        return avgNoOfCommentsPerUser;
    }

    public double getAvgNoOfCommentsPerPost() {
        return avgNoOfCommentsPerPost;
    }
}
