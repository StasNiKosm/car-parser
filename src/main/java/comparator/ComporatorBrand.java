package comparator;

import common.Car;

import java.util.Comparator;

public class ComporatorBrand implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getBrand().compareTo(car2.getBrand());
    }
}
