package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
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
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return  cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
