package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfusers;
    private int numberOfPosts;;
    private int numberOfComments;
    private double AvgNoOfPostsPerUser;
    private double AvgNoOfCommentsPerUser;
    private double AvgNoOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfusers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
            if(statistics.usersNames().size() == 0) {
              this.AvgNoOfPostsPerUser = 0;
              this.AvgNoOfCommentsPerUser = 0;
            } else {
              this.AvgNoOfPostsPerUser = statistics.postsCount() / (double) statistics.usersNames().size();
              this.AvgNoOfCommentsPerUser = statistics.commentsCount() / (double)statistics.usersNames().size();
            }
            if(statistics.postsCount() == 0) {
                this.AvgNoOfCommentsPerPost = 0;
            } else {
                this.AvgNoOfCommentsPerPost = statistics.commentsCount() / (double) statistics.postsCount();
            }
    }

    public void showStatistics() {
        System.out.println("----------- Forum Statistics -------------");
        System.out.println("Number of users: " + this.numberOfusers);
        System.out.println("Number of posts: " + this.numberOfPosts);
        System.out.println("Number of comments: " + this.numberOfComments);
        System.out.println("Average number of posts per user: " + this.AvgNoOfPostsPerUser);
        System.out.println("Average number of comments per user: " + this.AvgNoOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + this.AvgNoOfCommentsPerPost);
    }

    public int getNumberOfusers() {
        return numberOfusers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgNoOfPostsPerUser() {
        return AvgNoOfPostsPerUser;
    }

    public double getAvgNoOfCommentsPerUser() {
        return AvgNoOfCommentsPerUser;
    }

    public double getAvgNoOfCommentsPerPost() {
        return AvgNoOfCommentsPerPost;
    }
}
