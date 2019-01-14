package day1.stream;

import day1.sort.Car;
import day1.sort.ListCreat;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    List<Car> list = ListCreat.getCars();

    public static void main(String[] args) {
        Main main = new Main();
        List<Car> carsByColor = main.findByColor("yellow");
        List<Car> carsByPrice = main.findByPrice(23265, 34747);
//        carsByColor.forEach(System.out::println);
        carsByPrice.forEach(System.out::println);
    }

    private List<Car> findByColor(String color) {
//        Stream<Car> cars =  list.stream();
//        cars.forEach(System.out::println);

        return list.stream()
                .filter(x -> x.getColor().equals(color))
                .collect(Collectors.toList());
    }

    private List<Car> findByPrice(int priceMin, int priceMax) {

        return list.stream()
                .filter(x -> x.getPrice() < priceMax && x.getPrice() > priceMin)
                .collect(Collectors.toList());
    }


//    private List<Car> findByColor(String color) {
//        List<Car> listCar = new ArrayList<>();
//        for (Car car: list){
//            if(car.getColor().equals(color)){
//                listCar.add(car);
//            }
//        }
//        return listCar;
//    }

}
