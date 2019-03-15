package day3.threads;

import java.util.ArrayList;
import java.util.List;

public class PrintStars implements Runnable {

    private String star = "*";
    private List<String> listStars = new ArrayList<>();

    @Override
    public void run() {
        System.out.println("wątek rozpoczety");

        try {
            for (int i = 0; i < 200; i++) {
                System.out.print(star);
                listStars.add(star);
//                System.out.println(listStars.size());
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            System.out.print("przerwany wątek");
        }
    }

    public List<String> getListStars() {
        return listStars;
    }
}
