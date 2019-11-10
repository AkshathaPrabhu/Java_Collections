package main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set will never contain duplicate elements*
 */

public class c_1_SetInterface {
    public static void main(String[] args) {
        Set<String> hash_set = new HashSet<>();

        hash_set.add("Akshatha");
        hash_set.add("Akshatha");
        hash_set.add("Archana");
        hash_set.add("Rashmi");
        hash_set.add("Ramesh");

        System.out.println("HashSet is unsorted hence takes less time for operations: \n" + hash_set);


        //A TreeSet is a  Sorted Set

        Set<String> tree_set = new TreeSet<>();

        tree_set.add("Akshatha");
        tree_set.add("Akshatha");
        tree_set.add("Archana");
        tree_set.add("Rashmi");
        tree_set.add("Ramesh");

        System.out.println("\nTreeSet is a sorted set: \n" + tree_set);



    }

}


