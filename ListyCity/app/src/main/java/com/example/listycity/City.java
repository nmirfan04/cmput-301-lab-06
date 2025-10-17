package com.example.listycity;

import java.util.Objects;

/**
This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * This method compares cities based on city name field.
     * @return -1 if the caller is greater than the city name field, 1 if less than and 0 if equal
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /** This method compares if two cities are equal
     * @return
     * True if city name and province of 2 City objects are equal else False
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * Hash code for City object
     * @return
     * Generated integer hashcode from city name and province of City object
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}

