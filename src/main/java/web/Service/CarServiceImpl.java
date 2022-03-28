package web.Service;

import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{

    private final CarDao carDao = new CarDao();

    @Override
    public List<Car> getLimitedCars(int limit) {
        return carDao.getLimitedCars(limit);
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }
}
