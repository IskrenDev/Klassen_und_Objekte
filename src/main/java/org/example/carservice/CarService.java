package org.example.carservice;

import org.example.Car;

public class CarService {
    public static void main(String[] args) {
        Car car = new Car("BMW", "I3");
        System.out.println(car.getBrand());
        car.setBrand("VW");
        System.out.println(car.getBrand());
        System.out.println(car);
        Car car2 = new Car("BMW", "I3");
        boolean isEqualsCar = car.equals(car2);
        System.out.println(isEqualsCar);
    }
}
