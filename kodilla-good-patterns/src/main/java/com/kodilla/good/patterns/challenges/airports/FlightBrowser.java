package com.kodilla.good.patterns.challenges.airports;

import java.util.ArrayList;
import java.util.List;

public class FlightBrowser {
    static public void findFlightsFrom (List<Flight> flights , String city){
        flights.stream().filter(n -> n.from.equals(city)).forEach(System.out::println);
    }

    static public void findFlightsTo (List<Flight> flights , String city){
        flights.stream().filter(n -> n.to.equals(city)).forEach(System.out::println);
    }
}
