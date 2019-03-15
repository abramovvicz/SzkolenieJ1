package day5;

import java.util.Arrays;

public class BubbleSort {
    private static int[] tab = new int[]{9, 4, 2, 6, 7, 3, 5, 8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tab));
        sort(tab);
        System.out.println(Arrays.toString(tab));

    }


    public static void sort(int[] tab) {
        int t = tab.length;
        for (int i = 0; i < t - 1 - i; i++) {
            for (int j = 0; j < t - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int k = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = k;
                }
                System.out.print(j + " ,");
            }
            System.out.println();
            System.out.println(Arrays.toString(tab));
        }
    }

    public static void sort2(int[] tab) {

    }
}
