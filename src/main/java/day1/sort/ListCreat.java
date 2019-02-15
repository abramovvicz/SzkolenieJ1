package day1.sort;

import java.util.ArrayList;
import java.util.List;

public class ListCreat {
    public static List<Car> getCars() {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("niebieski", "M3", "BMW", 23265, 300));
        listCars.add(new Car("zółty", "i3", "BMW", 23265, 300));
        listCars.add(new Car("zielony", "quatro", "Audi", 234234, 250));
        listCars.add(new Car("czerwony", "V50", "Volvo", 23525, 256));
        listCars.add(new Car("czarny", "Picasso", "Citroen", 34747, 234));
        listCars.add(new Car("fioletowy", "Panda", "Fiat", 34323, 345));
        listCars.add(new Car("fioletowy", "Panda", "Fiat", 34734, 345));

        return listCars;
    }
}