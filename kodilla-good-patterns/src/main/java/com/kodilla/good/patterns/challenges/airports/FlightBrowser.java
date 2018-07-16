package com.kodilla.good.patterns.challenges.airports;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightBrowser {
    static public List<Flight> findFlightsFrom (List<Flight> flights , String city){
        //flights.stream().filter(n -> n.from.equals(city)).forEach(System.out::println);
        return flights.stream().filter(n -> n.from.equals(city)).collect(Collectors.toList());
    }

    static public List<Flight> findFlightsTo (List<Flight> flights , String city){
        //flights.stream().filter(n -> n.to.equals(city)).forEach(System.out::println);
        return flights.stream().filter(n -> n.to.equals(city)).collect(Collectors.toList());

    }

    static public  List<Flight> findFlightsFromTo(List<Flight> flights , String cityFrom, String cityInterChange, String cityTo){
        List<Flight> list = new ArrayList<>();
        //System.out.println(flights + cityFrom + cityInterChange + cityTo);
        //list.addAll(flights.stream().filter(n -> n.from.equals(cityFrom)).filter(n -> n.to.equals(cityInterChange)).collect(Collectors.toList()));
        //list.addAll(flights.stream().filter(n -> n.from.equals(cityInterChange)).filter(n -> n.to.equals(cityTo)).collect(Collectors.toList()));
        list.addAll(findFlightsTo(findFlightsFrom(flights,cityFrom),cityInterChange));
        list.addAll(findFlightsTo(findFlightsFrom(flights,cityInterChange),cityTo));

        return list;
    }
}
