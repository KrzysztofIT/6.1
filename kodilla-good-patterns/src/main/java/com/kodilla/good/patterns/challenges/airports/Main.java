package com.kodilla.good.patterns.challenges.airports;

import com.kodilla.good.patterns.challenges.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("1","Warszawa","Krakow"));
        flights.add(new Flight("2","Skierniewice","Gdynia"));

        String cityFrom = "Skierniewice";
        String cityTo = "Krakow";

        FlightBrowser.findFlightsFrom(flights , cityFrom );
        FlightBrowser.findFlightsTo(flights , cityTo );

    }
}


