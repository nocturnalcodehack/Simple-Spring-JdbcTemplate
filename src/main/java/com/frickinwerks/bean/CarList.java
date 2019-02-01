package com.frickinwerks.bean;

import java.util.List;

public class CarList {

    private static List<Car> cars;

    private static CarList _instance;
    private CarList(List<Car> c){
        this.cars = c;
    }

    public static CarList getInstance(List<Car> c) {
        if(_instance == null) {
            _instance = new CarList(c);
        }
        return _instance;
    }

    public static void returnInstance(CarList anInstance){
        //Take whatever action is needed
    }

    public static Integer getPrice(String c) {

        for(Car car: cars) {

            if (car.getName().equals(c)) {
                return car.getPrice();
            }
        }
        return -1;
    }
}
