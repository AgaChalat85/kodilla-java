package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
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

    public List<Flight> findFlightVia(String departureAirport, String arrivalAirport) {
        List<Flight> result = new ArrayList<>();
        List<Flight> flightsFrom = repository.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport)).collect(Collectors.toList());
        List<Flight> flightsTo = repository.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport)).collect(Collectors.toList());

        for(Flight flightFrom : flightsFrom) {
            for(Flight flightTo : flightsTo) {
                if(flightFrom.getArrivalAirport().equals(flightTo.getDepartureAirport())) {
                    FlightWithTransit flightWithTransit = new FlightWithTransit(0, departureAirport, flightFrom.getArrivalAirport(), arrivalAirport);
                    result.add(flightWithTransit);
                }
            }

        }
        if (result.isEmpty()) {
            System.out.println("The flight from  was not found");
        } else {
            result.forEach(System.out::println);
        }
        return result;
    }

       /* public List<Flight> findFlightVia(String departureAirport, String transitAirport, String arrivalAirport) {

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

    }*/

    }


