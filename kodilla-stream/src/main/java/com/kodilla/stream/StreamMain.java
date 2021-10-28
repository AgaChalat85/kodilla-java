package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Stream");

        Forum forum = new Forum();
        Map <Integer, ForumUser> theResultMapOfForumUser = forum.getList().stream()
                       .filter(forumUser -> forumUser.getSex() == 'M')
                       .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20).plusDays(1)))
                       .filter(forumUser -> forumUser.getNumbersOfPosts() >= 1)
                       .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser));

        theResultMapOfForumUser.entrySet().stream()
                       .map(entry -> entry.getKey() + ": " + entry.getValue())
                       .forEach(System.out::println);
    }
}

