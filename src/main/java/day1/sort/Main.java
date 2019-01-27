package day1.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    List<Car> list = ListCreat.getCars();



    public static void main(String[] args) {
        Main main = new Main();
//        Collections.sort(main.list);
//        main.list.forEach(x -> System.out.println(x.getName()+ ": "+x.getProducer()));

//        Collections.sort(main.list,(x,y) -> (int)(x.getPrice()-y.getPrice()));
//        main.printSortedBy(main.list,SortBy.NAME);
////        main.list.forEach(System.out::println);
        Car car1 = main.list.get(1);
        Car car2 = main.list.get(5);
        System.out.println(car1);
        System.out.println(car2);
//        System.out.println(car1.toString().equals(car2.toString()));
        System.out.println(car1.equals(car2));

    }

    public void printSortedBy(List<Car> cars, SortBy sortBy) {

        switch (sortBy) {
            case NAME:
                Collections.sort(cars, (x, y) -> x.getName().compareToIgnoreCase(y.getName()));
                break;
            case COLOR:
                Collections.sort(cars, (x, y) -> x.getColor().compareToIgnoreCase(y.getColor()));
                break;
            case PRICE:
                Collections.sort(cars, (x, y) -> (int) (x.getPrice() - y.getPrice()));
                break;
            case MAXSPEED:
                Collections.sort(cars, (x, y) -> x.getMaxSpeed() - y.getMaxSpeed()); // tożsame z tym niżej \/
                Collections.sort(cars, Comparator.comparingInt(Car::getMaxSpeed)); // tożsame z tym wyżej ^
                break;
            case PRODUCER:
                Collections.sort(cars, (x, y) -> x.getProducer().compareToIgnoreCase(y.getProducer()));
                break;

        }
    }



}