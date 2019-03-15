package day2.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>();
        System.out.println(calculator.add(3, 4));
        Calculator<BigDecimal> bigCalc = new Calculator<>();
        System.out.println(bigCalc.add(new BigDecimal(3.4), new BigDecimal(8.7)));


    }

    public void someMethod() {
        Lista<String> lista = new Lista<>();
        lista.addElement("dupa 1");
        lista.addElement("dupa 2");

        String table = lista.getElement(0);
        System.out.println(table);

        List testList = new ArrayList(); // bez generica to jest od razu obiektem
        testList.add("cos");
        String s = (String) testList.get(0);//dlatego tutaj to parsujemy na Stringa
    }
}
