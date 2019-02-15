package day1.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

    private List<String> list = new ArrayList<>();

    public LambdaTest() {
        list.add("Anna");
        list.add("Tomek");
        list.add("Bartek");
        list.add("Michał");
        list.add("Rafał");
    }

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.method1();

    }


    private static void method1() {
        LambdaTest lambdaTest = new LambdaTest();
        ;
        //        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.print(s + "-");
//            }
//        };
        lambdaTest.list.forEach(x -> System.out.println(x + "-"));
    }

    public static void method2() {
        LambdaTest lambdaTest = new LambdaTest();
//

        lambdaTest.list.sort(Comparator.comparingInt(String::length));
        //^^= krótszy zapisz =>//lambdaTest.list.sort((x,y) -> x.length()-y.length());
        lambdaTest.list.forEach(System.out::println); // krótszy zapis lambdy wada nic nie możemy zmieniać a ni dodać - ani spacji nic
//        System.out.println("************************");
//        Comparator <String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
//różnica między dwoma interfejsami
//        Comparator - porównuje obieky  -- używany na zewnątrz
//        Comparable - sotosowany w klasie, w której jest np. Car może implementować Comparable
    }

}
