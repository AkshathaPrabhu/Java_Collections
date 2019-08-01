

package main;

import java.util.*;

/**
 * Arraylist uses a dynamic array to store the elements.
 * The ArrayList class maintains the insertion order and is non-synchronized.
 * The elements stored in the ArrayList class can be randomly accessed.
 */

public class a_1_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aksha");     // names[0]
        names.add("Archu");     // names[1]
        names.add("Rashmi");    // names[2]
        names.add("Ramesh");    // names[2]

        System.out.println(names);

        //to replace a value in the arraylist
        names.set(2,"HEY");
        System.out.println(names);

        System.out.println("_________________________________________________");

        // Displaying elements  -- using indexed for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }



        System.out.println("_________________________________________________");

        // with predicate i.e .contains()
        boolean aksha = names.contains("Akshatha");
        System.out.println("Does the list contain Akshatha in it : " + aksha);



        // Displaying elements  -- using Iterator()
        System.out.println("_________________________________________________");
        System.out.println("Using Iterator() to print list elements ");

        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



        System.out.println("_________________________________________________");
        //To sort a collection in reverse Order  -- can be used only on numbers or chars
        System.out.println("Sorting a list");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("Sorting a list in reverse order");
        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);



        System.out.println("==================================================");
        List<Object> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add("Aksha");
        numbers.add(7.5f);
        numbers.add("Java");



        // Displaying elements  - foreach
        for (Object number : numbers) {
            System.out.println(number);
        }



        System.out.println("_________________________________________________");
        System.out.println(numbers);

        //Remove element from the specified index
        numbers.remove(1);
        System.out.println(numbers);

        //Remove specified element
        numbers.remove("Java");
        System.out.println(numbers);

        //Add element at the any index
        numbers.add(2, 5);
        System.out.println(numbers);

        //find the position of given element
        System.out.println("Position of num. 4 is : " +numbers.indexOf(4));

        //To swap two elements in a Collection
        System.out.println("Swapping positions of two elements in a list");
        Collections.swap(numbers, 0, 2);
        // Collections.swap(numbers, 0, 8);   // IndexOutOfBoundsException
        System.out.println(numbers);


        numbers.clear();
        System.out.println(numbers);

    }

}
