package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent asia = new Continent();
        asia.addCountry(new Country("China", new BigDecimal("1439323776")));
        asia.addCountry(new Country("India", new BigDecimal("1380004385")));
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("37846611")));
        europe.addCountry(new Country ("United Kingdom", new BigDecimal("67886011")));
        europe.addCountry(new Country ("Germany", new BigDecimal("83783942")));
        Continent africa = new Continent();
        africa.addCountry(new Country ("Sudan", new BigDecimal("43849260")));
        africa.addCountry(new Country ("Uganda", new BigDecimal("45741007")));
        Continent southAmerica = new Continent();
        southAmerica.addCountry(new Country("Peru", new BigDecimal("32971854")));
        southAmerica.addCountry(new Country("Chile", new BigDecimal("19116201")));

        World world = new World();
        world.addContinents(asia);
        world.addContinents(europe);
        world.addContinents(africa);
        world.addContinents(southAmerica);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3150523047");
        assertEquals(expectedPeopleQuantity,peopleQuantity );
    }
}
