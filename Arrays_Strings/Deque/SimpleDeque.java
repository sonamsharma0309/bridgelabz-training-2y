package Arrays_Strings.Deque;

public class SimpleDeque {

    private int[] deque;
    private int front;
    private int rear;
    private int capacity;

    public SimpleDeque(int size) {
        capacity = size;
        deque = new int[capacity];
        front = -1;
        rear = -1;
    }

    // Insert at front
    public boolean insertFront(int value) {
        if (isFull()) return false;

        if (isEmpty()) {
            front = rear = 0;
        } else if (front > 0) {
            front--;
        } else {
            return false; // no space at front
        }

        deque[front] = value;
        return true;
    }

    // Insert at rear
    public boolean insertRear(int value) {
        if (isFull()) return false;

        if (isEmpty()) {
            front = rear = 0;
        } else if (rear < capacity - 1) {
            rear++;
        } else {
            return false; // no space at rear
        }

        deque[rear] = value;
        return true;
    }

    // Delete from front
    public boolean deleteFront() {
        if (isEmpty()) return false;

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return true;
    }

    // Delete from rear
    public boolean deleteRear() {
        if (isEmpty()) return false;

        if (front == rear) {
            front = rear = -1;
        } else {
            rear--;
        }
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return deque[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1);
    }
}