package day3.set;

import java.util.*;
import java.util.stream.Collectors;

public class DoubleLetter {
    static String s = "ADsdsDCdfFFdscvSDAVS";

    public static void main(String[] args) {
//        System.out.println(findLetter(s));
        findAllDoubleLetters(s);
//        System.out.println("2 " + findDoubleLetter2(s));
//        System.out.println("3 " + findDoubleLetter3(s));
    }

    public static char findLetter(String s) {
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            int size = set.size(); // jaki jest size, cześo się korzysta ze set zwiększa swój size
            char c = s.charAt(i); //  rozdzielanie stringa na poszeczególne chary
            set.add(c);   // dodawanie c
            if (set.size() == size) {
//                System.out.println(c);

            }
        }
        return ' ';
    }

    public static List<String> findAllDoubleLetters(String s) {
        List<String> list = Arrays.asList(s.split(""));
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i).equals(list.get(i + 1))) {
//                System.out.println(list.get(i));
//            }
//        }
        int k = 0;
        for (String ss : list) {
            if (k < list.size() - 1) {
                if (list.get(k).equals(list.get(k + 1))) {
                    System.out.println(list.get(k));
                }
                k++;
            }
        }


        list.stream().collect(Collectors.groupingBy(String::new));

//zajebiste

//        list.forEach(System.out::println);
        return list;
    }


    public static char findDoubleLetter3(String s) {

        int k = s.length(); // iterator
        char[] c = s.toCharArray();
        for (int i = 0; i < k; i++) {

            System.out.println("c: " + c[i]); // tu muszę korzystąć z arry

            System.out.println("s: " + s.charAt(i)); //a tu nie musze korzystać z arraya


            if (s.substring(i + 1).contains(c[i] + "")) {
                return c[i];
            }


            //            if(s.substring(i+1).contains(s.charAt(i)+"")){
            //                return s.charAt(i);
            //            }
        }


        return ' ';
    }


    public static char findDoubleLetter(String s) {
        int size = s.length();
        char c[] = s.toCharArray();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (c[i] == c[j]) {
                    return c[i];
                }
            }
        }
        return ' ';
    }

    public static char findDoubleLetter2(String s) {
        int k = s.length();
        for (int i = 0; i < k; i++) {
            if (s.substring(i + 1).contains(s.charAt(i) + "")) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
