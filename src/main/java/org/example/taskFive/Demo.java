package org.example.taskFive;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("BMW car", "X5", 160000, 2023, Car.Engines.V12);
        CarService carService = new CarService();
        carService.addCar(car);
        carService.carsWithV12();
        carService.listOfCars();
/*        carService.removeCar(2);
        System.out.println("-------------");
        carService.listOfCars();*/
        carService.addCar(new Car("Maluszek", "Maluch", 670, 1989, Car.Engines.V6));

        System.out.println("\nOLD CAR:");
        carService.olderCars();


        System.out.println("\nMost expensive: ");

        System.out.println(carService.mostExpensiveCar());

        System.out.println("\nCheapest expensive: ");
        System.out.println(carService.cheapestCar());

        System.out.println("*****************");
        System.out.println(carService.cars);
        System.out.println(carService.sortAllCars("descending"));

        System.out.println("****************");
        Car car2 = new Car("BMW car", "X5", 16000, 2023, Car.Engines.V12);

        System.out.println(carService.isCarOnTheList(car2));








    }
}
