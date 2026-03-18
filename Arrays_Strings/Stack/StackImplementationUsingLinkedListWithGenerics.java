package Arrays_Strings.Stack;
class Stack<T> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    Stack() {
        top = null;
    }

    // Push
    void push(T value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    T pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return null;
        }
        T val = top.data;
        top = top.next;
        return val;
    }

    // Peek
    T peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }
}