package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {this.carDao = carDao;}

    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}
