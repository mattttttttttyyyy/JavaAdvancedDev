package org.example.taskFive;
/*Create a class called CarService that will contain a list of cars and implement the following methods:
        returning a list of cars produced by a specific manufacturer,
        returning a list of cars produced by a manufacturer with a founding year <,>,<=,>=,=,!= from the specified year.*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarService {

    List<Car> cars = new ArrayList<>(List.of(new Car("Samochodzik", "Yaris", 10000, 2021, Car.Engines.HYBRID, Car.Makers.TOYOTA),
            new Car("Samochodzik2", "Duster", 150000, 2020, Car.Engines.L15, Car.Makers.DACIA)));

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

    //returning the cheapest car,

    public String cheapestCar(){

        return cars.stream().sorted(Comparator
                .comparing(Car::getYearOfProduction))
                .toList().get(0).toString();
    }

    //returning cars from at least 3 manufacturers,

    public String manufacturesList(){
        return cars.get(0).getManufacturers().toString();
    }


   // returning a list of all cars sorted according to the passed parameter: ascending/descending,
   public String sortAllCars(String parameter){
        if (Objects.equals(parameter, "descending")){
            return cars.stream().sorted(Comparator
                            .comparing(Car::getName))
                    .toList().toString();
        } else return cars.stream().sorted(Comparator
                        .comparing(Car::getName).reversed())
                .toList().toString();


   }

    //checking if a specific car is on the list,


    public boolean isCarOnTheList(Car car){
        for (Car value : cars) if (value.hashCode() == car.hashCode()) return true;
        return false;
    }

    //returning a list of cars produced by a specific manufacturer,


    public void listOfCarsByMaker(String maker){
        IntStream.range(0, cars.size())
                .filter(i -> Objects.equals(cars.get(i).getMaker().toLowerCase(), maker.toLowerCase()))
                .mapToObj(i -> cars.get(i)).forEach(System.out::println);
    }


    //returning a list of cars produced by a manufacturer with a founding year <,>,<=,>=,=,!= from the specified year.*/


































}
