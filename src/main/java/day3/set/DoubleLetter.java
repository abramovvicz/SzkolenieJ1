package day3.set;

import java.util.Set;
import java.util.TreeSet;

public class DoubleLetter {
    static String s = "CABDAGC";

    public static void main(String[] args) {
        System.out.println(findLetter(s));
        System.out.println(findDoubleLetter(s));
        System.out.println(findDoubleLetter2(s));
    }

    public static char findLetter(String s) {
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            int size = set.size(); // jaki jest size, cześo się korzysta ze set zwiększa swój size
            char c = s.charAt(i); //  rozdzielanie stringa na poszeczególne chary
            set.add(c);   // dodawanie c
            if (set.size() == size) {
                return c;
            }
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
        char c[] = s.toCharArray();
        for (int i = 0; i < k; i++) {
            if (s.substring(i + 1).contains(s.charAt(i) + "")) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
