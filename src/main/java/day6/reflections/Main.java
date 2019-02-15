package day6.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Animal.class;

        // statyczny dostęp do klasy przez refleksję - to nie jest obiektem teraz
        //nazwaklasy.class // powołanie typu klass
        //Class clazz2 = Class.forName("day6.reflections.Animal");     //wyszukiwanie po nazwie metody}
        //Method[] metods = clazz.getMethods(); // ppobieranie wszystkie metod z klass łączne z tymi ktore są w nadklasie
        //refleksji używa się do testowania
        Method[] metods = clazz.getDeclaredMethods();
        Object o = clazz.newInstance(); //popatrzeć bo newInstance - jest depricated
        for (Method m : metods) {
            if (m.isAnnotationPresent(RunIt.class)) {   //sprawdzenie gdzie sa adnotacje
                System.out.println("nazwa metody: " + m.getName());
                System.out.println("nazwa adnotacji: " + m.getAnnotation(RunIt.class).name()); //m.getAnnotation(RunIt.class). - daje nam obiekt klasy RunIt
                m.invoke(o); //wywołanie metod na obiekcie o
            }
        }
    }
}