package org.example.taskFive;

import java.util.Objects;

/*
Create a Manufacturer class that will contain fields: name, year of establishment, country.
Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.

        Create a Car class that will contain fields: name, model, price, year of production,
        list of manufacturers (Manufacturer), and engine type
        (represented as an enum class, e.g. V12, V8, V6, S6, S4, S3).
        Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.*/
public class Manufacturer {
    private String name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                ", country='" + country + '\'' +
                '}';
    }
}
