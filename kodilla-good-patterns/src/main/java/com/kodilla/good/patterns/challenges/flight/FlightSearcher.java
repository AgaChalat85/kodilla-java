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

    public List<Flight> findFlightVia(String departureAirport, String transitAirport, String arrivalAirport) {

        List<Flight> result = repository.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getTransitAirportSet().contains(transitAirport))
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport)).collect(Collectors.toList());
        if (result.isEmpty()) {
            System.out.println("The flight from  " + departureAirport + " via " + transitAirport +  " to " + arrivalAirport + " was not found");
        } else {
            result.forEach(System.out::println);
        }
        return result;

    }
}


