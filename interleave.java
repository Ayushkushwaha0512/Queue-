import java.util.*;

/*Interleave 2 halves of a queue (even length)
 * Input->1 2 3 4 5 6 7 8 9 10
 * Output->1 6 2 7 3 8 4 9 5 10
 */
public class interleave {

    public static void interleave(Queue<Integer> q){
        Queue<Integer> FirstHalf = new LinkedList<>();
        int size =q.size();

        for(int i=0;i<size/2;i++){
            FirstHalf.add(q.remove());
        }

        while(!FirstHalf.isEmpty()){
            q.add(FirstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String agrs[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
