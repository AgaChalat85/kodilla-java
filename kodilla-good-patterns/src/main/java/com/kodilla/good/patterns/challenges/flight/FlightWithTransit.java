package com.kodilla.good.patterns.challenges.flight;

public class FlightWithTransit extends Flight {

    private String transit;

    public FlightWithTransit(int flightNumber, String departureAirport, String transit, String arrivalAirport) {
        super(flightNumber, departureAirport, arrivalAirport);
        this.transit = transit;
        isTransit = true;
    }

    public String getTransit() {
        return transit;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FlightWithTransit that = (FlightWithTransit) o;

        return transit != null ? transit.equals(that.transit) : that.transit == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (transit != null ? transit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Flight With Transit. Transit in: " + transit;
    }
}