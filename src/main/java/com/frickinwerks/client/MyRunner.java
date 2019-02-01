package com.frickinwerks.client;

import com.frickinwerks.bean.CarList;
import com.frickinwerks.service.Cars;
import com.frickinwerks.bean.Car;
import java.util.List;

import com.frickinwerks.helper.FindCarInBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Cars cdao;

    @Override
    public void run(String... args) throws Exception {

        try {
            Car car = cdao.findCar("Citroen");
            System.out.printf("ID: %d%n", car.getId());
            System.out.printf("Name: %s%n", car.getName());
            System.out.printf("Price: %d%n", car.getPrice());
            System.out.println();
            
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Car was not found");
        }

        List<Car> cars = cdao.findAll();
        
        for (Car car: cars) {
            System.out.printf("%d ", car.getId());
            System.out.printf("%s ", car.getName());
            System.out.println(car.getPrice());

        }
        System.out.println();

        CarList.getInstance(cars);

        Integer price;
        price = CarList.getPrice("Ford F150");

        System.out.println("Ford price: " + price.toString());

        price = CarList.getPrice("Ford F250");

        System.out.println("Ford 250 price: " + price.toString());

        FindCarInBean find = new FindCarInBean();

        price = find.getPrice("Ford F150");

        System.out.println("Ford 150 price from helper: " + price.toString());

    }
}
