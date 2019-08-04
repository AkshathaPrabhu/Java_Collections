package main;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 */
public class b_2_PriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Character> pq = new PriorityQueue<>();
        pq.add('Z');
        pq.add('A');
        pq.add('L');
        pq.add('C');
        pq.add('F');
        pq.add('I');

        Iterator iterator = pq.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println(pq);

    }


}
