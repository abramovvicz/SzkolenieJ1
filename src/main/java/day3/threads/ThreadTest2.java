package day3.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest2 {
    static int a = 0;
    static boolean flag = true;
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
//        new Thread(ThreadTest2::add).start();
//        new Thread(ThreadTest2::add).start();
        Thread t1 = new Thread(ThreadTest2::add, "w1") {
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        };
        Thread t2 = new Thread(ThreadTest2::add, "w2") {
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        };


        Thread.sleep(3000);
        System.out.println("end");
    }

    public synchronized static void add() {  // metoda synchronizowana dla watkow powoduje, że dopóki jeden z watkow
        // korzysta to inny nie z tej metody nie może korzystać

        try {
            while (flag) {
                a++;
                System.out.println(a + " ");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void addElement (int a) {
        System.out.println("Poczatek");
        synchronized (list){
            list.add(a);  // tylko ten obietk jest synchronizowany
        }
        System.out.println("koniec");
    }
}
