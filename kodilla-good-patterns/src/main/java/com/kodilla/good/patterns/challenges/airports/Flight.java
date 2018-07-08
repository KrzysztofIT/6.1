package com.kodilla.good.patterns.challenges.airports;

import java.util.Objects;

public class Flight {
    String name;
    String from;
    String to;

    public Flight(String name, String from, String to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getName(), flight.getName()) &&
                Objects.equals(getFrom(), flight.getFrom()) &&
                Objects.equals(getTo(), flight.getTo());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getFrom(), getTo());
    }
}
