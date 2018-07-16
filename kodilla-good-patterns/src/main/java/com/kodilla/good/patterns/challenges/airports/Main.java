package com.kodilla.good.patterns.challenges.airports;

import com.kodilla.good.patterns.challenges.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("1","Warszawa","Krakow"));
        flights.add(new Flight("2","Skierniewice","Gdynia"));
        flights.add(new Flight("3","Lodz","Skierniewice"));
        flights.add(new Flight("4","Skierniewice","Warszawa"));

        String cityFrom = "Skierniewice";
        String cityTo = "Krakow";

        String cityFrom1 = "Lodz";
        String cityTo1 = "Warszawa";
        String cityInterChange = "Skierniewice";


        System.out.println(FlightBrowser.findFlightsFrom(flights , cityFrom ));
        System.out.println(FlightBrowser.findFlightsTo(flights , cityTo ));
        System.out.println(FlightBrowser.findFlightsFromTo(flights , cityFrom1 , cityInterChange ,cityTo1 ));
    }
}


