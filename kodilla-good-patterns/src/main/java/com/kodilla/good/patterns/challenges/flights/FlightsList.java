package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsList {

    public static List<Flight> getList() {
        final List<Flight> theList = new ArrayList<>();

        theList.add(new Flight("Warszawa", "Gdańsk"));
        theList.add(new Flight("Gdańsk", "Warszawa"));
        theList.add(new Flight("Warszawa", "Wrocław"));
        theList.add(new Flight("Katowice", "Gdańsk"));
        theList.add(new Flight("Gdańsk", "Kraków"));
        theList.add(new Flight("Rzeszów", "Gdańsk"));
        theList.add(new Flight("Gdańsk", "Rzeszów"));
        theList.add(new Flight("Warszawa", "Szczecin"));
        theList.add(new Flight("Kraków", "Gdańsk"));
        theList.add(new Flight("Warszawa", "Gdańsk"));
        theList.add(new Flight("Warszawa", "Gdańsk"));
        theList.add(new Flight("Warszawa", "Gdańsk"));
        theList.add(new Flight("Warszawa", "Gdańsk"));

        return new ArrayList<>(theList);
    }
}
