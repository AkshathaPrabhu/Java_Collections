package main;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList implements LIST and DEQUE
 *
 * LinkedList is a linear data structure.
 * However LinkedList elements are not stored in contiguous locations like arrays;
 * they are linked with each other using POINTERS.
 * <p>
 * <p>
 * Each element of the LinkedList has the reference(address/pointer) to the next element of the LinkedList
 * <p>
 * hence each element in the LinkedList is called the NODE.
 */

public class a_2_LinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // List<String> linkedList = new LinkedList<>();   -- can define like this but you will get only the functions of List()

        linkedList.add("Akshatha");
        linkedList.add("Archana");
        linkedList.add("Ramesh");
        linkedList.add("Rashmi");

        System.out.println(linkedList);

        System.out.println("Using foreach loop to print :");
        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("\nUsing .iterator() loop to print :");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        linkedList.addFirst("Paper Boat");   //Adding an element to the first position

        linkedList.addLast("Himalaya");     //Adding an element to the last position

        System.out.println("LinkedList after addition of first and last element: " + linkedList);

        linkedList.remove(2);              //REMOVING the 3rd element
        System.out.println(linkedList);

        linkedList.add(5, "HEY");        //ADDING an element in given position of the linkedList
        System.out.println(linkedList);

        linkedList.set(5, "HI");         //REPLACE an element in given position of the linkedList
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedList);



        System.out.println("_________________________________________________________\n");



        //Code to swap elements at 2nd and 5th position and to sort the list in descending order
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addFirst(25);
        numbers.add(12);
        numbers.add(36);
        numbers.add(5);
        numbers.add(43);
        System.out.println("Numbers in the list are : " + numbers);

        Collections.swap(numbers, 1, 4);
        System.out.println("After swapping 2nd and 5th elements : " + numbers);

        Collections.sort(numbers);
        System.out.println("List in sorted form: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("In sorted descending order: " + numbers);


    }
}
