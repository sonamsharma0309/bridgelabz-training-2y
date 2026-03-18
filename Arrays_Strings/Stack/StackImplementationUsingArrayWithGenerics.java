package Arrays_Strings.Stack;

class StackArray<T> {

    private T[] arr;
    private int top;
    private int capacity;

    // Constructor
    @SuppressWarnings("unchecked")
    StackArray(int size) {
        capacity = size;
        arr = (T[]) new Object[size]; // generic array creation
        top = -1;
    }

    // Push
    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    // Pop
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top--];
    }

    // Peek
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return arr[top];
    }

    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull
    public boolean isFull() {
        return top == capacity - 1;
    }
}