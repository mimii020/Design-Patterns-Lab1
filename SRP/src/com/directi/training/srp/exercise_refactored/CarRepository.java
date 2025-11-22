package com.directi.training.srp.exercise_refactored;
import java.util.List;

public interface CarRepository {
    public List<Car> findAll();
    public Car findById(String id);
}
