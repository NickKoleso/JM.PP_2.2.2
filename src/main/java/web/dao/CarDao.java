package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    void save(Car car);

    void delete(Car car);

    List<Car> getAll();

    Car getById(int id);
}
