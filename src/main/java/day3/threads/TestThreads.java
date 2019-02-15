package day3.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestThreads {
    static boolean check = true;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
//        new Thread(new CountNumbers()).start();  /// start wystartowanie wątku uruchamia metode run() z thread domyślnie mam stop
//        new CountLetters().start();
//        new Thread(()->countLetter()).start();  // () puste nawiasy bo interfejs Thread nie przyjmuje parametrów i wtedy stosuje się ()
//        Thread thread =  new Thread(){
//            @Override
//            public void run() {
//                countLetter();
//            }
//        };
//        thread.start();
//**********************
//        Thread t1 = new Thread(new CountNumbers()); // implements interface
//        Thread t2 = new CountLetters();  // extend class thread
//        t1.start();
//        t2.start();
//        Thread.sleep(3000); // czekanie na wątek
//        t1.interrupt(); //przerwanie wątku musi być w thread sleep i try catch w metodach counterLetters
//        t1.join(); // powoduje ze główny wątek będzie czekał aż te się pokończą
//        t2.join();
//********************


        Thread t3 = new Thread(new PrintStars());
        Thread t4 = new Thread(new CountStars());
        t3.start();
        PrintStars stars = new PrintStars();
        System.out.println("yo" + stars.getListStars().size());
        Thread.sleep(3000);
        t3.interrupt();
        t4.start();
        t3.join();
        t4.join();

/*
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(new PrintStars(), 0, 1, TimeUnit.SECONDS);

         service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(new CountStars(), 0, 8, TimeUnit.SECONDS);
*/





        /*
        new Thread(()->countLetter()).start();
        Thread.sleep(300);
        check = false;
//      inny sposób na zamykanie wątku
        System.out.println("End");
        */
    }


    public static void countLetter() {
        int i = -1;
        char c = 'A';
        try {
            while (check) {
                i = (i + 1) % 10;
                System.out.print((char) (i + c));
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.print("przerwany wątek");

        }
    }
}
