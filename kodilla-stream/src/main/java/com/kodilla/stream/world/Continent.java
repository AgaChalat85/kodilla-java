package com.kodilla.stream.world;

import java.util.*;

public final class Continent {

    private final List<Country> countriesList = new ArrayList<>();

    public void addCountry(Country country) {
        countriesList.add(country);
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
}
