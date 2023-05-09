package org.example.taskFive;
/*Create a class called CarService that will contain a list of cars and implement the following methods:
        returning the most expensive car,
        returning the cheapest car,
        returning cars from at least 3 manufacturers,
        returning a list of all cars sorted according to the passed parameter: ascending/descending,
        checking if a specific car is on the list,
        returning a list of cars produced by a specific manufacturer,
        returning a list of cars produced by a manufacturer with a founding year <,>,<=,>=,=,!= from the specified year.*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarService {

    List<Car> cars = new ArrayList<>(List.of(new Car("Samochodzik", "Yaris", 10000, 2021, Car.Engines.HYBRID),
            new Car("Samochodzik2", "Duster", 150000, 2020, Car.Engines.L15)));

   // adding cars to the list,

    public void addCar(Car car){
        cars.add(car);
    }

    //removing a car from the list,

    public void removeCar(int carIndexNr){
        cars.remove(carIndexNr);
    }

    //returning the list of all cars,

    public void listOfCars(){
        IntStream.range(0, cars.size())
                .mapToObj(i -> ("Car nr ") + i + "\n" + cars.get(i))
                .forEachOrdered(System.out::println);
    }

    //returning the cars with a V12 engine,

    public void carsWithV12(){
        IntStream.range(0, cars.size())
                .filter(i -> Objects.equals(cars.get(i).engine, "V12"))
                .mapToObj(i -> cars.get(i)).forEach(System.out::println);
    }

//    returning cars manufactured before 1999,

    public void olderCars(){
        cars.stream().filter(car -> car
                .getYearOfProduction() < 1999)
                .forEachOrdered(System.out::println);
    }

    //returning the most expensive car,

    public String mostExpensiveCar(){

        return cars.stream().sorted(Comparator
                .comparing(Car::getYearOfProduction)
                .reversed()).toList().get(0).toString();
    }
















}
