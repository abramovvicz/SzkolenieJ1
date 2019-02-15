package day5.fifoLifo;

public class ArrayQueueSecond {
    String[] stringArray = new String[10];
    int lastIndex = -1;

    public static void main(String[] args) {
        ArrayQueueSecond arrayQueue = new ArrayQueueSecond();
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("element 1 ");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("element 2 ");
        arrayQueue.peek("element 3 ");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());

        for (int i = 0; i < 10; i++) {
            arrayQueue.peek("element 3 " + i);

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayQueue.pop());


        }
    }

    public void peek(String s) {
        if (lastIndex == stringArray.length - 1) {
            System.out.println("Kolejka jest pełny");
            return;
        }
        stringArray[++lastIndex] = s;
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
