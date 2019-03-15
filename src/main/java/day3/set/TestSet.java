package day3.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        method(10);
    }

    public static void method(int size) {
//        Set<Integer> set = new TreeSet<>();
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int a = random.nextInt(12);
            set.add(a);
            System.out.print(a + " ");

        }
        System.out.println();
        set.forEach(x -> System.out.print(x + " "));
    }

}
