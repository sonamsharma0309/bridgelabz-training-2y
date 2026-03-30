package Arrays_Strings.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class ReverseQueueRecursion {

    public static void reverseQueue(Queue<Integer> q) {
        // Base case
        if (q.isEmpty()) return;

        // Step 1: remove front
        int front = q.poll();

        // Step 2: recursive call
        reverseQueue(q);

        // Step 3: add back
        q.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        reverseQueue(q);

        System.out.println(q); // [4, 3, 2, 1]
    }
}