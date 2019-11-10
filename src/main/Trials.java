package main;

import java.util.HashSet;
import java.util.Set;

public class Trials {
    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        String a = new String("abc");
        String b = new String("abc");
        String c = "abc";

        stringSet.add(a);
        stringSet.add(b);
        stringSet.add(c);

        System.out.println(stringSet);
        System.out.println(a.equals(b));   //true
        System.out.println(a == b);  //false

        System.out.println(a == c);


    }
}
