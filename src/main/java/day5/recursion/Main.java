package day5.recursion;

public class Main {

    public static void main(String[] args) {
        System.out.println(add(5, 4));
        System.out.println(silnia(6));
    }

    private static int add(int a, int b) {
        if (b == 0) {  // w rekursji musi być warunek wyjścia
            return a;
        }
        return add(++a, --b);
    }

    private static int silnia(int n) {
        if (n == 0) return 1;
        return n * silnia(n - 1);
    }
}
