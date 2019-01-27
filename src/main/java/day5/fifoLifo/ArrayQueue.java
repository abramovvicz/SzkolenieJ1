package day5.fifoLifo;

public class ArrayQueue {
    String[] stringArray = new String[100];
    int firstIndex = 0;
    int lastIndex = -1;

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("element 1 ");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("element 2 ");
        arrayQueue.peek("element 3 ");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
    }

    public void peek(String s) {
        if (lastIndex == stringArray.length - 1) {
            System.out.println("Kolejka jest pełny");
            return;
        }
        stringArray[++lastIndex] = s;
    }

    public String pop() {
        if (firstIndex > lastIndex) {
            System.out.println("kolejka jest pusta");
            return "";
        }
        return stringArray[firstIndex++];
    }
}
