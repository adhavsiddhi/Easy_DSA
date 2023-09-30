/*
 *    Deque [ Double ended queue ]
 */

import java.util.*;

public class DequeB {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(5);
        System.out.println(deque); // [3, 2, 1, 5]
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque); // [2, 1]
        System.out.println("get first : " + deque.getFirst()); // get first : 2
        System.out.println("get last : " + deque.getLast()); // get last : 1
    }
}

/*
 * Output:
 * [3, 2, 1, 5]
 * [2, 1]
 * get first : 2
 * get last : 1
 * 
 */
/*The code you provided is a Java program that demonstrates the use of a deque (double-ended queue) using the LinkedList class from the Java Collections framework. Here's a breakdown of the code and its output:

You import the java.util.* package to use classes from the Java Collections framework.

In the main method:

You create a Deque of integers called deque using a LinkedList implementation.

You add elements to the front of the deque using addFirst. So, the deque initially contains [3, 2, 1].

You add an element to the end of the deque using addLast, making it [3, 2, 1, 5].

You print the contents of the deque, which results in [3, 2, 1, 5].

You remove the first element using removeFirst, so the deque becomes [2, 1, 5].

You remove the last element using removeLast, resulting in [2, 1].

You print the first element using getFirst(), which prints 2.

You print the last element using getLast(), which prints 1.

The output matches your comment descriptions:

csharp
Copy code
[3, 2, 1, 5]
[2, 1]
get first : 2
get last : 1
The program demonstrates the basic operations you can perform with a deque, including adding and removing elements from both ends.*/




