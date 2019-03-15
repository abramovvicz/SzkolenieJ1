package day1.sort;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String color;
    private String name;
    private String producer;
    private double price;
    private int maxSpeed;

    public Car(String color, String name, String producer, double price, int maxSpeed) {
        this.color = color;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //    @Override
//    public int compareTo(Car o) {
//        return name.compareToIgnoreCase(o.getName());
//    }
    @Override
    public int compareTo(Car o) {
        int a = producer.compareToIgnoreCase(o.getProducer());
        if (a == 0) { //compareToIgnoreCase - zwaraca inta czyli  jak ma 0 to te stringi są tkie same
            a = name.compareToIgnoreCase(o.getName());
        }
        return a;
    }

   /* @Override
    public boolean equals(Object o) {
        Car car = (Car) o; //rzutowanie na obiekt
        return this.color.equals(car.getColor());
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // sprawdza miejsce w pamięci
        if (o == null || getClass() != o.getClass())
            return false; // sprawdza czy obiekt nie jest nullem (nie sprawadza this bo juz ten obiekt istniejejestęsmy w tej klasie

        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                maxSpeed == car.maxSpeed &&
                Objects.equals(color, car.color) &&
                Objects.equals(name, car.name) &&
                Objects.equals(producer, car.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, maxSpeed, price, producer);
    }
}
//hashCode jest szybki powstał po to aby optymalizować sprawdzanie obiektów - sprawdzany jest jako pierwszy
//jezeli dwa obiekty są identyczne to hascode jest taki sam
//jesli nie są identyczne haschode moze byc taki same dlatego sprawdzamy equals
