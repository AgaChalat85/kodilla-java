package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlightSearcher {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
       Optional<Boolean> result = creatAirportsMap().entrySet().stream()
               .filter(a -> a.getKey().equals(flight.getArrivalAirport())).map(keyset -> keyset.getValue()).findFirst();
        if(!result.isPresent()) {
            throw new RouteNotFoundException("The airport: " + flight.getArrivalAirport() + " was not found");
        }
        return result.get();
    }

    private Map<String, Boolean> creatAirportsMap() {
        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("Amsterdam", true);
        airportsMap.put("Berlin", false);
        airportsMap.put("Lisbon", true);
        airportsMap.put("Athens", true);
        airportsMap.put("Warsaw", false);
        airportsMap.put("Baghdad", true);
        airportsMap.put("Buenos Aires", true);
        airportsMap.put("Tokyo", false);
        airportsMap.put("Vienna", true);
        airportsMap.put("Kiev", true);
        airportsMap.put("Hong Kong", false);
        airportsMap.put("London", true);

        return airportsMap;
    }
}
