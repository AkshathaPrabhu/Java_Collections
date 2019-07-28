/**
 * Arraylist uses a dynamic array to store the elements.
 * The ArrayList class maintains the insertion order and is non-synchronized.
 * The elements stored in the ArrayList class can be randomly accessed.
 *
 * */

package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a_ArrayList {

    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Aksha");     // names[0]
        names.add("Archu");     // names[1]
        names.add("Rashmi");    // names[2]
        names.add("Ramesh");    // names[2]


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        System.out.println("_________________________________________________");

        boolean aksha = names.contains("Akshatha");
        System.out.println("Does the list contain Aksha in it : " + aksha);

        System.out.println("_________________________________________________");
        System.out.println("Printing list eleem");

        Iterator iterator = names.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("_________________________________________________");
        List<Integer> numbers = new ArrayList();
        numbers.add(4);     // names[0]
        numbers.add(6);     // names[1]
        numbers.add(1);    // names[2]
        numbers.add(3);    // names[2]


        Iterator iterator1 = numbers.iterator();

        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }

    }

}
