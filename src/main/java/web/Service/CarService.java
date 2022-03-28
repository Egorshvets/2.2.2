package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getLimitedCars(int limit);
    public List<Car> getCars();
}
