package comparator;

import common.Car;

import java.util.Comparator;

public class ComporatorYear implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getYear().compareTo(car2.getYear());
    }
}
