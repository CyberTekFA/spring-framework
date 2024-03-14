package com.hypertek.bootstraps;

import com.hypertek.entity.Car;
import com.hypertek.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DataGenerator implements CommandLineRunner{

    private final CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("Toyota","Corolla");
        Car car2 = new Car("Acura","MDX");
        Car car3 = new Car("Audi","Audi7");
        Car car4= new Car("BMW","X7");
        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);
        carRepository.save(car4);
    }
}
