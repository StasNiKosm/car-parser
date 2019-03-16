import common.Car;
import comparator.ComporatorBrand;
import comparator.ComporatorId;
import comparator.ComporatorYear;
import parse.ParsingCars;
import read.FileTextReader;

import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FileTextReader fileTextReader = new FileTextReader("D:\\workspace\\stas\\src\\main\\resources\\cars.txt");
        List<Car> cars = ParsingCars.parse(fileTextReader.read());
        Collections.sort(cars, new ComporatorId().thenComparing(new ComporatorBrand()).thenComparing(new ComporatorYear()));
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}

