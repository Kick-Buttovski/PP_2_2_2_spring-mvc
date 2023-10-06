package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    List<Car> cars = new ArrayList<>();

    public CarServiceImp() {
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Accord", 2021));
        cars.add(new Car("Nissan", "Altima", 2019));
        cars.add(new Car("Ford", "Mustang", 2022));
        cars.add(new Car("Chevrolet", "Camaro", 2021));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
