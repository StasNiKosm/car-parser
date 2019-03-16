package comparator;

import common.Car;

import java.util.Comparator;

public class ComporatorId implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getId() > car2.getId() ? 1 : car1.getId() < car2.getId() ? -1 : 0;
    }
}

