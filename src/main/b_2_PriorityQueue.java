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


        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(100);
        number.add(500);
        number.add(250);
        number.add(13);
        number.add(200);
        number.add(345);
        System.out.println(number);

        number.poll();
        System.out.println(number);
        System.out.println(number);

        number.element();
        number.remove();
        number.peek();
    }


}
