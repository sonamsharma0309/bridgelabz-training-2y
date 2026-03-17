package Arrays_Strings.Stack;

import java.util.ArrayList;

class StackUsingList {
    ArrayList<Integer> list = new ArrayList<>();

    // Push
    void push(int x) {
        list.add(x);
    }

    // Pop
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    // Peek
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return list.get(list.size() - 1);
    }

    // Check empty
    boolean isEmpty() {
        return list.size() == 0;
    }
}