package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private List<Country> countries = new ArrayList<>();

    public void addItem(Country item) {
        countries.add(item);
    }

    public boolean removeItem(Country item) {
        return countries.remove(item);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
