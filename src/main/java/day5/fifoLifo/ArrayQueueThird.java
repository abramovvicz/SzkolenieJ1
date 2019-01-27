package day5.fifoLifo;

public class ArrayQueueThird {
    String[] stringArray = new String[10];
    int lastIndex = -1;

    public static void main(String[] args) {
        ArrayQueueThird arrayQueue = new ArrayQueueThird();
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("pierwszy 1 ");
        arrayQueue.peek("inny 1 ");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("drugi 2 ", true);
        arrayQueue.peek("trzeci 3 ");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());

//        for (int i = 0; i < 10; i++) {
//            arrayQueue.peek("element 3 " + i);
//
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arrayQueue.pop());
//
//
//        }
    }

    public void peek(String s) {
        if (lastIndex == stringArray.length - 1) {
            System.out.println("Kolejka jest pełny");
            return;
        }
        stringArray[++lastIndex] = s;
    }


    public void peek(String s, boolean priorytet) {
        if (lastIndex == stringArray.length - 1) {
            System.out.println("Kolejka jest pełny");
            return;
        }
        if (priorytet) {
            for (int i = lastIndex; i >= 0; i--) {
                stringArray[i + 1] = stringArray[i];
            }
            stringArray[0] = s;
            lastIndex++;
        } else {
            stringArray[++lastIndex] = s;
        }
    }


    public String pop() {
        if (lastIndex < 0) {
            System.out.println("kolejka jest pusta");
            return "";
        }
        String s = stringArray[0];
        for (int i = 0; i <= lastIndex; i++) {
            if (i < lastIndex) stringArray[i] = stringArray[i + 1];
        }
        lastIndex--;
        return s;
    }
}
