package day6.matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matchers {
    /*
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * */

//    ["\w\d_."]+@["\w\d_""].com

    public static void main(String[] args) {
        boolean b = new Matchers().test("test34._@gmail.com");
        System.out.println(b ? "Adres is ok" : "Adres nie jest ok ");
    }

    public boolean test(String email) {
        String matcher = "[\\w\\d_.]+@[\\w\\d_]+.com";
        Pattern pattern = Pattern.compile(matcher); // komilowanie machera
        Matcher m = pattern.matcher(email); // matcher sprawdza sobie nasz string
        return m.matches(); //  sprawadza cały string od początku do końcatest34._@gmail.com.pl - zwróciło mi false
//        return m.find();//sprawdza czy w strignu znadje pattern test34._@gmail.com.pl - zwróciło mi true
    }
}

