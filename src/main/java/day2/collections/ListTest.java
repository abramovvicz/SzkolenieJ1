package day2.collections;

import day1.sort.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    List<String> arrayList; //array ma zadeklarowane 100 elementów jak przekroczy to dodaje 100
    List<String> linkedList; //array ma zadeklarowane 100 elementów jak przekroczy to dodaje 100

    public static void main(String[] args) {
        ListTest listTest = new ListTest();
        listTest.creatList(1000000);
//        listTest.checkTimeAddingElement(53, "nasz element");
//        listTest.getElement(50);
//        listTest.checkElement("txt50000");
        listTest.checkHashCode(345657);
    }

    public void creatList(int index) {
        arrayList = new ArrayList<>(index);
        linkedList = new LinkedList<>();
        for (int i = 0; i < index; i++) {
            arrayList.add("txt" + i);
            linkedList.add("txt" + i);
        }
    }

    public void checkHashCode(int index){
        List<Car> listCar = new ArrayList<>(index);
        for (int i = 0; i <index; i++) {
            listCar.add(new Car("black"+i,"v50"+i, "volvo"+i, 37, 342 ));
        }
        Car car = listCar.get(10);
        System.out.println(car);
        long start1 = System.currentTimeMillis();
        System.out.println(listCar.contains(car));
        long stop1 = System.currentTimeMillis();

        System.out.println("ArrayListTime " + (stop1 - start1));

    }

    public void checkTimeAddingElement(int index, String element) {
        long start1 = System.currentTimeMillis();
        arrayList.add(index, element);
        long stop1 = System.currentTimeMillis();
        System.out.println("ArrayListTime " + (stop1 - start1));


//        List<String> linkedList = new LinkedList<>(arrayList);kopiowanie  do linkedlist arraylist
        long start2 = System.currentTimeMillis();
        arrayList.add(index, element);
        long stop2 = System.currentTimeMillis();
        System.out.println("LinkedListTime " + (stop2 - start2));

    }


    public void getElement(int index) {
        long start1 = System.currentTimeMillis();
        System.out.println(arrayList.get(index));
        long stop1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        System.out.println(linkedList.get(index));
        long stop2 = System.currentTimeMillis();


        System.out.println("ArrayListTime " + (stop1 - start1));
        System.out.println("LinkedListTime " + (stop2 - start2));
    }

    public void checkElement(String element) {
        long start1 = System.currentTimeMillis();
        arrayList.contains(element);
        long stop1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        linkedList.contains(element);

        long stop2 = System.currentTimeMillis();


        System.out.println("ArrayListTime " + (stop1 - start1));
        System.out.println("LinkedListTime " + (stop2 - start2));
    }
}
