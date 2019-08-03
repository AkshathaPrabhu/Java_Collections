package main;

import java.io.BufferedReader;
import java.util.*;

/**
 * Stack is the subclass of Vector (and Vector implements the List interface).
 * It implements the last-in-first-out data structure (LIFO), i.e., Stack.
 * The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.
 */

public class a_3_Stack {


    public static void main(String args[]) {
        Stack<String> stack = new Stack<>();
        stack.push("Himalaya");
        stack.push("Vicks");
        stack.push("Frames");
        stack.push("Bottles");
        stack.push("Paper");


        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Popping the stack : " + stack.pop());

        System.out.println("________________________________________________\n");

        // code to take inout from user and push into a stack
        System.out.println("Give total size of stack:  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Input the number: ");
        Scanner sc = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        for (int i = 1; i <= num; i++) {
            numbers.push(sc.nextInt());
        }
        System.out.println(numbers);

        System.out.println("________________________________________________\n");

        System.out.println(numbers.peek());  //returns element on top of stack but DOES NOT REMOVE it
        System.out.println(numbers);


        System.out.println(numbers.pop());  //returns element on top of stack but REMOVES it
        System.out.println(numbers);

        System.out.println("Adding an element");
        numbers.add(34);                    //Adding an element
        System.out.println(numbers);

        System.out.println("Removing 3rd element");
        numbers.remove(2);                  //REMOVING the 3rd element
        System.out.println(numbers);

        System.out.println("Adding an element in the 5th index");
        numbers.add(5, 66);                //ADDING an element in given position of the linkedList
        System.out.println(numbers);

        System.out.println("Replacing the element in the 5th index");
        numbers.set(5, 56);               //REPLACE an element in given position of the linkedList
        System.out.println(numbers);

    }
}
