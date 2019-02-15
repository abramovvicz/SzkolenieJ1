package day3.set;

import java.util.*;

public class MapTest {
    Map<Integer, String> map = new HashMap<>(); // klucz jest setem a dane to lista

    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.generateMap(10);
        mapTest.printMap();
    }


    public void generateMap(int size) {
        for (int i = 0; i < size; i++) {
            map.put(i, "string " + i);
        }
    }

    public Set<Integer> getKey() {
        return map.keySet();
    }

    public List<String> getValues() {
        return new ArrayList<>(map.values()); // musi być do array listy
    }

    public void printMap() {
        for (Integer i : getKey()) {
            System.out.println(i + " " + map.get(i));
        }

    }

    public void printMap1() {
        for (Map.Entry<Integer, String> print : map.entrySet()){
            System.out.println(print.getKey()  + print.getValue());
        }

    }

}
