package org.example.taskFive;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Create a Manufacturer class that will contain fields: name, year of establishment, country.
Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.

        Create a Car class that will contain fields: name, model, price, year of production,
        list of manufacturers (Manufacturer), and engine type
        (represented as an enum class, e.g. V12, V8, V6, S6, S4, S3).
        Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.*/
public class Car {
    List<Manufacturer> manufacturers = new ArrayList<>(List.of(new Manufacturer("Toyota", 1937, "Japan"),
            (new Manufacturer("Dacia", 1937, "Japan")), (new Manufacturer("BMW", 1937, "Japan"))));
    private String name;
    private String model;
    private double price;
    private int yearOfProduction;
    String engine;
    //Manufacturer manufacturer;
    //List<Manufacturer> manufacturersList = new ArrayList<>(List.of(new Manufacturer("Toyota", 1937, "Japan")));


    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public String getName() {
        return name;
    }

    public Car(String name, String model, double price, int yearOfProduction, Engines engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.engine = String.valueOf(engine);
        //this.manufacturers = manufacturers;


    }

    public double getPrice() {
        return price;
    }

    enum Engines {
        V12, V8, HYBRID, L15, V6;

    }

    @Override
    public String toString() {
        return "\n"+name + "\nModel: "+ model + "\nProduction year: "+ yearOfProduction + "\nEngine: " + engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearOfProduction == car.yearOfProduction && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfProduction, engine);
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
