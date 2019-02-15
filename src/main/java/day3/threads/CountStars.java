package day3.threads;

public class CountStars implements Runnable {

    PrintStars printStars = new PrintStars();

    @Override
    public void run() {
        System.out.println("wątek rozpoczety");
        int stars = 1;
        try {
            for (int i = 0; i < 200; i++) {
                stars = printStars.getListStars().size();
                System.out.println(stars);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.print("przerwany wątek");
        }
    }


}
