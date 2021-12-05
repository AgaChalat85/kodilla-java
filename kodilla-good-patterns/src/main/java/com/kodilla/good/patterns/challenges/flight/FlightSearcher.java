package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

    public void findFlightFrom(String airport) {
        List<Flight> result = creatFlightsSet().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport)).collect(Collectors.toList());
        result.forEach(System.out::println);

    }

    public List<Flight> findFlightTo(String airport) {
        List<Flight> result = creatFlightsSet().stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport)).collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
    }

    public List<Flight> findFlightVia(String airport) {
        List<Flight> result = creatFlightsSet().stream()
                .filter(flight -> flight.getTransitAirportSet().contains(airport)).collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
    }

    private Set<Flight> creatFlightsSet() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight(23424, "Kraków", "Warszawa"));
        flights.add(new Flight(45342, "Rzeszów", "Gdańsk", Set.of("Warszawa")));
        flights.add(new Flight(24678, "Kraków", "Katowice"));
        flights.add(new Flight(56789, "Warszawa", "Kraków"));
        flights.add(new Flight(78542, "Rzeszów", "Berlin", Set.of("Warszawa", "Poznań")));
        flights.add(new Flight(23424, "Katowice", "Oslo", Set.of("Szczecin")));
        flights.add(new Flight(23424, "Gdańsk", "Rzeszów", Set.of("Katowice", "Kraków")));

        return flights;
    }
}


