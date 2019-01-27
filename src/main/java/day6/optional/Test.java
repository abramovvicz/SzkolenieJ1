package day6.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {

    List<Dog> dogs = new ArrayList<>();

    public Test() {
        dogs.add(new Dog(1, "burek"));
        dogs.add(new Dog(2, "zdzichu"));
        dogs.add(new Dog(3, "gieniek"));
        dogs.add(new Dog(4, "piesio"));
    }

    public void method() {
        Optional<Dog> optional = dogs.stream().filter(x -> x.getId() == 3).findFirst(); // obiekt klasy dog pobrany  z filter
        // z naszej listy gdzie jest opakowany wrapper optiional - klasa dla wraperów
        Dog d = optional.orElse(new Dog(5, "oiesio"));//zwraca nasz obiekt

        Optional<Dog> newOptional = Optional.of(new Dog(7, "burek2"));
    }
}

