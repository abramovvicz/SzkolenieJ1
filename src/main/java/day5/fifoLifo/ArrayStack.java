package day5.fifoLifo;


import java.util.Arrays;

public class ArrayStack {
    String[] strings = new String[100];
    int lastIndex = -1;

    public static void main(String[] args) {

        ArrayStack arraysStack = new ArrayStack();
//        System.out.print(arraysStack.pop() + " ");

        for (int i = 0; i < 102; i++) {
            arraysStack.peek("sttign " + i);
        }
        for (String s : arraysStack.strings) {
            System.out.print(arraysStack.pop() + " ");
        }
    }

    public void peek(String s) {
        if (lastIndex == strings.length - 1) {
            System.out.println("Stos jest pełny");
            String[] temp = Arrays.copyOf(strings, strings.length + 1);
            strings = temp;
        }
        strings[++lastIndex] = s;  // TODO:przstudiować i zrozumieć kiedt ++zmienna a zmienna++
    }

    public String pop() {
        if (lastIndex < 0) {
            System.out.println("Stos jest pusty");
            return "";
        }
        return strings[lastIndex--];
    }

}
