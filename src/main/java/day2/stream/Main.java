package day2.stream;

import day1.sort.ListCreat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
//        new Main().arrayToStream();
//        new Main().streamCreate();
        new Main().mapCar();
//        new Main().intLotto();
//        new Main().creatStream2();

    }

    private void arrayToStream() {
        String[] tableStrings = new String[]{"Ala", "Ola", "Piotrek", "Artur", "Bartek"};

        Arrays.stream(tableStrings).filter(x -> x.length() == 5).forEach(System.out::println);

    }

    private void streamCreate() {  // tworzenie samemu streamów
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
        Stream<String> arrayStream = Stream.of("Ala", "Ola", "Piotrek", "Artur", "Bartek");
        arrayStream.forEach(System.out::println);
        Stream<String> streamBuilder = Stream.<String>builder().add("Ala").add("Ola").build();
        streamBuilder
                .map(x -> x.toUpperCase()) // mapowanie zamienianien czegoś na coś
                .forEach(System.out::println);

    }

    private void intLotto() {
//        Stream<Integer> intStream = Stream.generate(()->45).limit(10);
        IntStream intStream = new Random().ints(40); // do sprawdzenia
        intStream.forEach(System.out::println);
    }

    private void creatStream2() throws IOException {
        Stream<String> someString = Files.lines(Paths.get("pom.xml"));
        someString.forEach(System.out::println);
    }

    private void mapCar() {
        String s =
                ListCreat.getCars()
                        .stream()
                        .map(x -> x.getColor().toUpperCase())
                        .collect(Collectors.joining(" - "));  // to już daje nam całego stringa

        System.out.println(s);
        //.forEach(x-> System.out.print(" - " + x);
    }


//    private void arrayToStream() {
//        String[] tableStrings = new String[]{"Ala", "Ola", "Piotrek", "Michał", "Bartek"};
//        Predicate<String> keyWord = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() == 5;
//                //s.lenght()==5 to już zwraca boolean
//            }
//        };
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        Arrays.stream(tableStrings).filter(keyWord).forEach(consumer);
//
//    }
}
