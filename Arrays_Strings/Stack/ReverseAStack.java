package Arrays_Strings.Stack;

import java.util.*;

class ReverseStack {

    // Insert at bottom
    static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, x);
        stack.push(top);
    }

    // Reverse stack
    static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverse(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}