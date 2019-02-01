package com.frickinwerks.repository;

import com.frickinwerks.bean.Car;
import java.util.List;

import com.frickinwerks.service.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarsImpl implements Cars {
   
    @Autowired
    protected JdbcTemplate jtm;

    @Override
    public Car findCar(String name) {

        String sql = "SELECT * FROM Cars WHERE Name = ?";
        Object[] param = new Object[]{name};

        Car car = (Car) jtm.queryForObject(sql, param,
                new BeanPropertyRowMapper(Car.class));

        return car;
    }

    @Override
    public List<Car> findAll() {

        String sql = "SELECT * FROM Cars";

        List<Car> cars = jtm.query(sql, new BeanPropertyRowMapper(Car.class));

        return cars;
    }
}
