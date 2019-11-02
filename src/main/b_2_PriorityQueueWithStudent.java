package main;

import java.util.PriorityQueue;

public class b_2_PriorityQueueWithStudent {

    public static void main(String[] args) {


        PriorityQueue<Student> students = new PriorityQueue<>(5, new b_2a_StudentComparator());

        students.add(new Student("Akshatha", 34));
        students.add(new Student("Aksh", 54));
        students.add(new Student("Aks", 12));
        students.add(new Student("Aksa", 24));


        //printing in descending order of marks
        while (students.size() != 0) {
            Student poll = students.poll();
            System.out.println(poll.name + " " + poll.marks);
        }

    }
}
