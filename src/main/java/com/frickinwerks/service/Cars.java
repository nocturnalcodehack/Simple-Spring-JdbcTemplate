package com.frickinwerks.service;

import com.frickinwerks.bean.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Cars {

  public Car findCar(String name);
  public List<Car> findAll();
}