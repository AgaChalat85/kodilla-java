package com.kodilla.exception.test;

public class FlightSearcherRunner {

    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("London", "Madrid");
        Flight flight3 = new Flight("London", "Athens");

        try {
            System.out.println(flightSearcher.findFlight(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
