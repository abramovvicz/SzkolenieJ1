package day2.generic;

import java.util.Arrays;

public class Lista<T> {  //generici może być tu wszystko ale przyęte jest T,S, R
    private Object [] objects = new Object[0];

    //wada generików jst to ze nie przyjmuja typow prostych
    public void addElement(T element) {
        Object[] temporaryArray = Arrays.copyOf(objects, objects.length + 1);
        temporaryArray[temporaryArray.length-1] = element;
        objects = temporaryArray;
    }

    public T getElement(int index) {
        return (T) objects[index];
    }
}

