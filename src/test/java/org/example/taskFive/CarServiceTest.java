package org.example.taskFive;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.Assert.*;

public class CarServiceTest {


    CarService carService = new CarService();


    @Test
    public void addCar() {
        carService.addCar(new Car("wwww", "wwwww", 19222, 1991, Car.Engines.V12, Car.Makers.DACIA));
        Assertions.assertEquals(3, carService.cars.size());
    }

    @Test
    public void removeCar() {
        carService.removeCar(1);
        Assertions.assertEquals(1, carService.cars.size());
    }

    @Test
    public void listOfCars() {
    }

    @Test
    public void carsWithV12() {
    }

    @Test
    public void olderCars() {
    }

    @Test
    public void mostExpensiveCar() {
    }

    @Test
    public void cheapestCar() {
    }

    @Test
    public void manufacturesList() {
    }

    @Test
    public void sortAllCars() {
    }

    @Test
    public void isCarOnTheList() {
    }

    @Test
    public void listOfCarsByMaker() {
    }
}