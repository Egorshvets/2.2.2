package web.Dao;

import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

public class CarDao {

    private List<Car> cars = Stream.of(new Car("BMW", "e92-coupe", 15000),
            new Car("Mersedes", "W204 C-classe", 15000),
            new Car("Toyota", "Crown", 20000),
            new Car("Audi", "RSQ8", 150000),
            new Car("Honda", "Civic", 7500)).toList();


    public List<Car> getLimitedCars(int limit) {
        return cars.stream().limit(limit).toList();
    }

    public List<Car> getCars() {
        return cars;
    }
}
