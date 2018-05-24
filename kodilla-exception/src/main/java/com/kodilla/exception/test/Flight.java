package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public boolean findFilght (Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warszawa" , true);
        flightMap.put("Londyn" , true);
        flightMap.put("Nowy Jork" , true);
        flightMap.put("Meksyk" , true);
        flightMap.put("Moskwa" , false);
        flightMap.put("Bruksela" , false);
        flightMap.put("Toronto" , false);

        if (flightMap.containsKey(flight.getArrivalAirport()) && flightMap.containsKey(flight.getDepartureAirport())) {
            return flightMap.get(flight.getDepartureAirport()) && flightMap.get(flight.getArrivalAirport());
        }else{
            throw new RouteNotFoundException("RouteNotFoundException");
        }
    }
}
