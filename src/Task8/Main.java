package Task8;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Person> people = new ConcurrentLinkedDeque<>();
        people.add(new Person( "Arlen", 20, 55));
        people.add(new Person( "Jack", 23, 70));
        people.add(new Person( "Emily", 19, 40));
        people.add(new Person( "Zorina", 22, 43));
        people.add(new Person( "Hannah", 27, 48));

        WaitList<Person> waitList = new WaitList<>(people);
        System.out.println(waitList);
        Person newOne = new Person("New guy", 90, 90);
        waitList.add(newOne);
        System.out.println("New one is in people? " + waitList.contains(newOne));
        System.out.println(waitList);
        System.out.println();

        BoundedWaitList<Person> boundedWaitList = new BoundedWaitList<>(2);
        boundedWaitList.add(new Person( "Emily", 19, 40));
        boundedWaitList.add(new Person( "Zorina", 22, 43));
        boundedWaitList.add(new Person( "Hannah", 27, 48));
        System.out.println(boundedWaitList);
        System.out.println();

        UnfairWaitList<Person> unfairWaitList = new UnfairWaitList<>();
        Person arlen = new Person( "Arlen", 20, 55);
        unfairWaitList.add(arlen);
        Person jack = new Person(  "Jack", 23, 70);
        unfairWaitList.add(jack);
        Person emily = new Person(  "Emily", 19, 40);
        unfairWaitList.add(emily);
        Person zorina = new Person( "Zorina", 22, 43);
        unfairWaitList.add(zorina);
        Person hannah = new Person( "Hannah", 27, 48);
        unfairWaitList.add(hannah);

        System.out.println(unfairWaitList);
        unfairWaitList.remove(emily);
        unfairWaitList.toBack(arlen);
        System.out.println(unfairWaitList);
    }
}
