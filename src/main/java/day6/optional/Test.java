package day6.optional;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static void main(String[] args) throws IOException {
        Test test = new Test();
//        test.loadFile();
        test.method();

//        System.out.println(test.changeLetters("Sam Harris"));
//        System.out.println(test.changeLetters("Patrick Feenan"));
//        System.out.println(test.changeLetters("Evan Cole"));
//        System.out.println(test.changeLetters("P Favuzzi"));
//        System.out.println(test.changeLetters("David Mendieta"));
//        System.out.println(test.changeLetters("DAVID.MENDIETA"));


    }

    public void method() {
        Optional<Dog> optional = dogs.stream().filter(x -> x.getId() == 6).findFirst(); // obiekt klasy dog pobrany  z filter
        // z naszej listy gdzie jest opakowany wrapper optiional - klasa dla wraperów
        Dog d = optional.orElse(new Dog(5, "piesio id 5"));//zwraca nasz obiekt
        Optional<Dog> newOptional = Optional.of(new Dog(7, "burek2"));
        System.out.println("stream " + optional);
        System.out.println("orElse " + d);
        System.out.println("new " + newOptional);
        dogs.forEach(System.out::println);


    }


    public void loadFile() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("pan-tadeusz.txt")), StandardCharsets.UTF_8);
        List<String> list = Arrays.asList(content.split("\\PL+"));
        System.out.println(list.stream().filter(x -> x.length() > 12).count());

        System.out.println(list.parallelStream().filter(x -> x.length() > 12).count());

        long i = 0;
        for (String w : list) {


            if (w.length() > 12) {
                i++;
//                System.out.println(w);
            }
        }
        System.out.println(i);

    }


    public String changeLetters(String name) {
        return name.toUpperCase().replaceAll("(?!\\b[A-Z])([A-Z])", "").replaceAll("\\s", ".");
//        return name.toUpperCase().replaceAll ("(.).*\\s(.).*", "$1.$2"  );

    }


}

