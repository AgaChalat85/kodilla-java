package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User lukasz = new Millenials("Lukasz Kowalski");
        User szymon = new YGeneration("Szymon Wydra");
        User kacper = new ZGeneration("Kacper Kot");

        //When
        String lukaszPostOn = lukasz.sharePost();
        System.out.println("Lukasz post on " + lukaszPostOn);
        String szymonPostOn = szymon.sharePost();
        System.out.println("Szymon post on " + szymonPostOn);
        String kacperPostOn = kacper.sharePost();
        System.out.println("Kacper post on " + kacperPostOn);

        //Then
        assertEquals("Facebook", lukaszPostOn);
        assertEquals("Twitter", szymonPostOn);
        assertEquals("Snapchat", kacperPostOn);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User lukasz = new Millenials("Lukasz Kowalski");

        //When
        String lukaszPostOn = lukasz.sharePost();
        System.out.println("Lukasz post on " + lukaszPostOn);
        lukasz.setSocialPublisher(new SnapchatPublisher());
        lukaszPostOn = lukasz.sharePost();
        System.out.println("Lukasz now post on : " + lukaszPostOn);

        //Then
        assertEquals("Snapchat", lukaszPostOn);
    }
}
