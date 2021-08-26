package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();
    @Override
    public void save(Car car) {
        carDao.save(car);
    }

    @Override
    public void delete(Car car) {
        carDao.delete(car);
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }


    @Override
    public Car getById(int id) {
        return carDao.getById(id);
    }

    @Override
    public List<Car> getCars(Integer count) {
        return carDao.getCars(count);
    }
}
