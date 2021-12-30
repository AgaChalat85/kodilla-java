package com.kodilla.good.patterns.challenges.flight;

public class FlightSearcherRunner {

    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();
        //flightSearcher.findFlightFrom("Rzeszów");
        //flightSearcher.findFlightTo("Kraków");
        flightSearcher.findFlightVia("Gdańsk", "Wrocław");
        //flightSearcher.findFlightTo("Londyn");

    }
}
