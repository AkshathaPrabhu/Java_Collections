package main;

import java.util.PriorityQueue;

public class PriorityQueueWithStudent {

    public static void main(String[] args) {


        PriorityQueue<Student> students = new PriorityQueue<>(5, new StudentComparator());

        students.add(new Student("Akshatha", 34));
        students.add(new Student("Aksh", 54));
        students.add(new Student("Aks", 12));
        students.add(new Student("Aksa", 24));

        while (students.size() != 0) {
            System.out.println(students.poll().name);
        }

    }
}
