package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class ForumStatisticsTestSuite {

    private ForumStatistics forumStatistics;

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void init() {
        forumStatistics= new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsersName(500));
        when(statisticsMock.postsCount()).thenReturn(1500);
        when(statisticsMock.commentsCount()).thenReturn(2500);

    }
    private List <String> generateListOfUsersName(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        StringBuilder usersName = new StringBuilder();
        for (int n = 0; n < usersQuantity; n++) {
            usersName.append("name" + n);
            resultList.add(usersName.toString());
        }
        return resultList;
    }

    @Test
    void testCalculateAdvStatisticsWhenPostsQuantityEquals0() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0,forumStatistics.getNumberOfPosts());
        assertEquals(0.0, forumStatistics.getAvgNoOfPostsPerUser());
        assertEquals(5.0, forumStatistics.getAvgNoOfCommentsPerUser());
        assertEquals(0.0, forumStatistics.getAvgNoOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenPostsQuantityEquals1000() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000,forumStatistics.getNumberOfPosts());
        assertEquals(2.0, forumStatistics.getAvgNoOfPostsPerUser());
        assertEquals(5.0, forumStatistics.getAvgNoOfCommentsPerUser());
        assertEquals(2.5, forumStatistics.getAvgNoOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsQuantityEquals0() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0,forumStatistics.getNumberOfComments());
        assertEquals(3.0, forumStatistics.getAvgNoOfPostsPerUser());
        assertEquals(0.0, forumStatistics.getAvgNoOfCommentsPerUser());
        assertEquals(0.0, forumStatistics.getAvgNoOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsQuantityIsLessThenPostsQuantity() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(3.0, forumStatistics.getAvgNoOfPostsPerUser());
        assertEquals(2.0, forumStatistics.getAvgNoOfCommentsPerUser());
        assertEquals(0.7, forumStatistics.getAvgNoOfCommentsPerPost(), 0.1);
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsQuantityIsBiggerThenPostsQuantity() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(4500);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(3.0, forumStatistics.getAvgNoOfPostsPerUser());
        assertEquals(9.0, forumStatistics.getAvgNoOfCommentsPerUser());
        assertEquals(3.0, forumStatistics.getAvgNoOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenUsersNumberEquals0() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsersName(0));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0.0, forumStatistics.getAvgNoOfPostsPerUser());
        assertEquals(0.0, forumStatistics.getAvgNoOfCommentsPerUser());
        assertEquals(1.7, forumStatistics.getAvgNoOfCommentsPerPost(), 0.1);
    }

    @Test
    void testCalculateAdvStatisticsWhenUsersNumberEquals100() {
        // Given
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsersName(100));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getNumberOfUsers());
        assertEquals(15.0, forumStatistics.getAvgNoOfPostsPerUser());
        assertEquals(25.0, forumStatistics.getAvgNoOfCommentsPerUser());
        assertEquals(1.7, forumStatistics.getAvgNoOfCommentsPerPost(), 0.1);
    }
}

