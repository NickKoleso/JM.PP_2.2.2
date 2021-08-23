package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void save(Car car);

    void delete(Car car);

    List<Car> getAll();

    Car getById(int id);
}
