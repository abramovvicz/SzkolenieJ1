package day3.threads;

import java.util.List;

public class TestThreads {
   static  boolean check = true;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
//        new Thread(new CountNumbers()).start();  /// start wystartowanie wątku uruchamia metode run() z thread domyślnie mam stop
//        new CountLetters().start();
//        new Thread(()->countLetter()).start();  // () puste nawiasy bo intergejs Thread nie przyjmuje parametrów i wtedy stosuje się ()
//        Thread thread =  new Thread(){
//            @Override
//            public void run() {
//                countLetter();
//            }
//        };
//        thread.start();
//**********************
//        Thread t1 = new Thread(new CountNumbers()); // implements interface
//        Thread t2 = new CountLetters();  // extend clas thread
//        t1.start();
//        t2.start();
//        Thread.sleep(3000); // czekanie na wątek
//        t1.interrupt(); //przerwanie wątku musi być w thread sleep i try catch w metodach counterLetters
//        t1.join(); // powoduje ze główny wątek będzie czekał aż te się pokończą
//        t2.join();
//********************
        new Thread(()->countLetter()).start();
        Thread.sleep(4000);
        check = false;
//// inny sposób na zamykanie wątku


        System.out.println("End");

    }


    public static void countLetter() {
        int i = -1;
        char c = 'A';
        try {
            while (check) {
                i = (i + 1) % 10;
                System.out.print((char) (i + c));
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.print("przerwany wątek");

        }
    }
}
