package parse;

import common.Car;

import java.util.ArrayList;
import java.util.List;

public class ParsingCars {


    public static List<Car> parse(List<String> strList) {
        List<Car> cars = new ArrayList<>();
        for (String str : strList) {
            String data[] = str.split(",");
            Car car = new Car();
            car.setId(Integer.valueOf(data[0]));
            car.setBrand(data[1]);
            car.setYear(data[2]);
            car.setColor(data[3]);
            cars.add(car);
        }
        return cars;
    }


}
