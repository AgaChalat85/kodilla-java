package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;
    private Set<String> transitAirportSet =  new HashSet<>();
    private int flightNumber;

    public Flight(int flightNumber, String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNumber = flightNumber;
    }

    public Flight(int flightNumber, String departureAirport, String arrivalAirport, Set<String> transitAirportSet) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.transitAirportSet = transitAirportSet;
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public Set<String> getTransitAirportSet() {
        return transitAirportSet;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightNumber != flight.flightNumber) return false;
        if (departureAirport != null ? !departureAirport.equals(flight.departureAirport) : flight.departureAirport != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport != null)
            return false;
        return transitAirportSet != null ? transitAirportSet.equals(flight.transitAirportSet) : flight.transitAirportSet == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (transitAirportSet != null ? transitAirportSet.hashCode() : 0);
        result = 31 * result + flightNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", transitAirportSet=" + transitAirportSet +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
