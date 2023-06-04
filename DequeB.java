import java.util.*;

/*
 * addFirst()
 * addLast()
 * removeFirst()
 * removeLast()
 * getFrist()
 * getLast()
 */

public class DequeB {
    public static void main(String args[]){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(8);
        dq.addFirst(6);
        // deque-> 6 2 1 3 8
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);     //deque -> [2 1 3]

        System.out.println(dq.getFirst()); // ->2

        System.out.println(dq.getLast());   //->3
    }
}
