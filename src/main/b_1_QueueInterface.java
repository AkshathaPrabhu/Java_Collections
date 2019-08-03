package main;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue interface maintains the first-in-first-out order (FIFO).
 * There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface
 * <p>
 * Queue is an interface so we cannot instantiate it, rather we create an instance of LinkedList or PriorityQueue and assign it to the Queue
 * <p>
 * .peek() ~ .element(), .remove() ~ poll()
 */
public class b_1_QueueInterface {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();       // instantiating a LinkedList as a Queue

        //Adding elements to the Queue
        q.add("Rick");
        q.add("Maggie");
        q.add("Glenn");
        q.add("Negan");
        q.add("Daryl");

        System.out.println("Elements in Queue:" + q);

        /*
         * .remove()
         * REMOVES the first element from the queue and gives that as the o/p
         */
        System.out.println("Removed element: " + q.remove());
        System.out.println(q);

        /*
         * element() method - this returns the head of the
         * queue but DOES NOT REMOVE it from the queue.
         * Head is the first element of Queue
         */
        System.out.println("Head: " + q.element());

        /*
         * poll() method
         * - same as .remove() method but it returns null if the Queue is empty
         */
        System.out.println("poll(): " + q.poll());

        /*
         * peek() method - it works same as element() method,
         * however it returns null if the Queue is empty
         */
        System.out.println("peek(): " + q.peek());

        //Again displaying the elements of Queue
        System.out.println("Elements in Queue:" + q);

    }

}
