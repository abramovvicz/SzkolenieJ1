package day3.threads;

public class CountLetters extends Thread {
    @Override
    public void run() {
        int i = -1;
        int end = 0;
        char c = 'A';
        try {
//            while (true) {
            while (end < 40) {
                end++;
                i = (i + 1) % 10;
                //odliczanie o 1 do 10
                System.out.println(i);
//                System.out.print((char) (i + c));
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.print("przerwany wątek");

        }
    }
}
