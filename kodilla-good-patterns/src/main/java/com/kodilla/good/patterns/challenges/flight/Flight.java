package com.kodilla.good.patterns.challenges.flight;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;
    protected boolean isTransit;

    public Flight(int flightNumber, String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;

    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public boolean isTransit() {
        return isTransit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (isTransit != flight.isTransit) return false;
        if (departureAirport != null ? !departureAirport.equals(flight.departureAirport) : flight.departureAirport != null)
            return false;
        return arrivalAirport != null ? arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (isTransit ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight from: " + departureAirport + "to: " + arrivalAirport;

    }
}
