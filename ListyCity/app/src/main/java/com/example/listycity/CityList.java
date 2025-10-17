package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if a city is in the cities list.
     * @param city
     * City to be checked if in city list
     * @return
     * True if city in city list
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Delete city if it exists in the list, else throw an exception
     * @param city
     * City to be deleted
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns size of city list
     * @return
     * Integer size of city list.
     */
    public int countCities() {
        return cities.size();
    }
}
