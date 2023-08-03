package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDao {
    List<Car> carList = new ArrayList<>();

    public static List<Car> addCars(List<Car> carList) {
        carList.add(new Car("BMW", "X6", 2018));
        carList.add(new Car("Audi", "A3", 2014));
        carList.add(new Car("Mersedes", "SLS", 2011));
        carList.add(new Car("Volkswagen", "Golf", 2019));
        carList.add(new Car("Opel", "Astra", 2009));
        return carList;
    }
    @Override
    public List<Car> getCarList(int count) {
        carList = addCars(carList);
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
