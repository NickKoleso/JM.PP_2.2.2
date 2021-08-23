package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car(1991, "Mercedes-Benz W140", "Germany"));
        cars.add(new Car(1995, "BMW E34", "Germany"));
        cars.add(new Car(1964, "Porsche 911", "Germany"));
        cars.add(new Car(2007, "Audi R8", "Germany"));
        cars.add(new Car(2008, "Volkswagen Golf VI", "Germany"));
    }

    @Override
    public void save(Car car) {
        cars.add(car);
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public Car getById(int id) {
        return cars.get(id);
    }
}
