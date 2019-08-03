package main;

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
    }
}
