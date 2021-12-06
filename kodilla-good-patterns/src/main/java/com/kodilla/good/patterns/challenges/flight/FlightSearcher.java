package com.kodilla.good.patterns.challenges.flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

    private FlightRepository repository = new FlightRepository();

    public List<Flight> findFlightFrom(String airport) {
        List<Flight> result = repository.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport)).collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("The airport: " + airport + " was not found");
        } else {
            result.forEach(System.out::println);

        }
        return result;
    }

    public List<Flight> findFlightTo(String airport) {
        List<Flight> result = repository.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport)).collect(Collectors.toList());
        if (result.isEmpty()) {
            System.out.println("The airport: " + airport + " was not found");
        } else {
            result.forEach(System.out::println);
        }
        return result;
    }

    public List<Flight> findFlightVia(String airport) {
        List<Flight> result = repository.getFlights().stream()
                .filter(flight -> flight.getTransitAirportSet().contains(airport)).collect(Collectors.toList());
        if (result.isEmpty()) {
            System.out.println("The airport: " + airport + " was not found");
        } else {
            result.forEach(System.out::println);
        }
        return result;

    }
}


