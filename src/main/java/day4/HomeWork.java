package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork {
    final List<Integer> list = new ArrayList<>();
    int a = 0;
    Object o = new Object();
    Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) throws InterruptedException {
        HomeWork homeWork = new HomeWork();
        Thread t1 = new Thread(() -> homeWork.count(("A")));
        Thread t2 = new Thread(() -> homeWork.count("B"));
        t1.start();
        t2.start();
        Thread.sleep(4000);
        t1.interrupt();
        Thread.sleep(2000);
        t2.interrupt();
        t1.join();
        t2.join(); // poowduje ze on poceka az zakonczeniei się watku
        System.out.println("Wielkość listy " + homeWork.list.size());
        System.out.println("Wielkość seta " + homeWork.set.size());
        System.out.println();
        System.out.println("Koniec programu");
    }

    public void count(String name) {
        try {

            while (true) {
                synchronized (o) {
                    a++;
                    System.out.print(name + ":" + a + " ");
                    list.add(a);
                    set.add(a);
                    Thread.sleep(30);
                }

            }
        } catch (InterruptedException e) {
            System.err.println("Konie wątku " + name);
        }
    }
}
