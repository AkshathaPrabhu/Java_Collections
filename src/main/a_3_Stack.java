package main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * Stack is the subclass of Vector (and Vector implements the List interface).
 * It implements the last-in-first-out data structure (LIFO), i.e., Stack.
 * The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean pop(), which defines its properties.
 * <p>
 * .push(), .pop(), .peek(), .remove()
 */

public class a_3_Stack {


    public static void main(String args[]) {


        Stack<String> stack = new Stack<>();
        stack.push("Himalaya");             // .push()   -- adds and element to the stack
        stack.push("Vicks");
        stack.push("Frames");
        stack.push("Bottles");
        stack.push("Paper");


        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ///.pop()  -  gives the element at the TOP of the stack
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
        System.out.println(numbers + "\n");


        /*
         * .peek() method
         * returns element on top of stack but DOES NOT REMOVE it
         */
        System.out.println(numbers.peek());
        System.out.println(numbers);

        /*
         * .pop() method
         * returns element on top of stack but REMOVES it
         */
        System.out.println(numbers.pop());
        System.out.println(numbers);

        /*
         * .add() method
         * Adding an element
         */
        System.out.println("Adding an element");
        numbers.add(34);
        System.out.println(numbers);

        /*
         * .remove() method
         * REMOVING the 3rd element
         */
        System.out.println("Removing 3rd element");
        numbers.remove(2);
        System.out.println(numbers);

        System.out.println("Adding an element in the 5th index");
        numbers.add(5, 66);                //ADDING an element in given position of the linkedList
        System.out.println(numbers);

        System.out.println("Replacing the element in the 5th index");
        numbers.set(5, 56);               //REPLACE an element in given position of the linkedList
        System.out.println(numbers);



    }
}
