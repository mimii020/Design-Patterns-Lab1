package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class InMemoryDb implements CarRepository {
    private List<Car> _carsDb = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));

    @Override
    public List<Car> findAll() {
        return this._carsDb;
    }

    @Override
    public Car findById(String id) {
        for (Car car : this._carsDb) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }
}