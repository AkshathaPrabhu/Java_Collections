package main;

import java.util.Comparator;
import java.util.PriorityQueue;


public class b_2_PriorityQueueWithCustomComparator {
    public static void main(String[] args) {


        Comparator<Integer> compareLength = new Comparator<Integer>() {
            @Override
            public int compare(Integer v1, Integer v2) {
                return v1.compareTo(v2);
            }
        };

        PriorityQueue<Integer> lengthPq = new PriorityQueue<>(compareLength);
        lengthPq.add(1234566);
        lengthPq.add(12323);
        lengthPq.add(4564);
        lengthPq.add(988);
        lengthPq.add(364);

        System.out.println(lengthPq);

        PriorityQueue<Integer> lengthPq2 = new PriorityQueue<>();
        lengthPq2.add(1234566);
        lengthPq2.add(12323);
        lengthPq2.add(4564);
        lengthPq2.add(988);
        lengthPq2.add(364);

        System.out.println(lengthPq2);





    }
}
