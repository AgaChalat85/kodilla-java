package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {

    private static Set<Flight> flights;

    static {
        flights = new HashSet<>();
        flights.add(new Flight(23424, "Kraków", "Warszawa"));
        flights.add(new Flight(45342, "Rzeszów", "Gdańsk"));
        flights.add(new Flight(24678, "Kraków", "Katowice"));
        flights.add(new Flight(56789, "Warszawa", "Kraków"));
        flights.add(new Flight(78542, "Rzeszów", "Berlin"));
        flights.add(new Flight(27424, "Katowice", "Oslo"));
        flights.add(new Flight(27424, "Gdańsk", "Kraków"));
        flights.add(new Flight(57639, "Warszawa", "Paryż"));
        flights.add(new Flight(57639, "Kraków", "Wrocław"));
        flights.add(new Flight(57639, "Gdańsk", "Warszawa"));
        flights.add(new Flight(57639, "Warszawa", "Wrocław"));

    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

}
