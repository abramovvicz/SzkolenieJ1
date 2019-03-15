package day2.generic;


import java.math.BigDecimal;

public class Calculator<T extends Number> { // deklarujemy od razu ze to moga być liczby jak Integer, BigInteger itd/
    public Number add(T a, T b) {

        if (a instanceof Integer) {
            int c = a.intValue();
            int d = b.intValue();
            System.out.println("Integer");
            return (Integer) (c + d);
        }

        if (a instanceof BigDecimal) {
            System.out.println("BigDecimal");
            return ((BigDecimal) a).add((BigDecimal) b);
        }
        return null;
    }
}
