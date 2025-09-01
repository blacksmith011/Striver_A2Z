package Demo;

import java.util.Deque;
import java.util.LinkedList;

class MyArrayDeque {
    public int[] deque;
    public int front, rear, size, capacity;

    @SuppressWarnings("unchecked")
    public MyArrayDeque(int capacity) {
        this.capacity = capacity;
        this.deque = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Check if deque is full
    private boolean isFull() {
        return size == capacity;
    }

    // Check if deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add element at the front
    public void addFirst(int data) {
        if (isFull()) throw new RuntimeException("Deque is full");

        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        deque[front] = data;
        size++;
    }

    // Add element at the rear
    public void addLast(int data) {
        if (isFull()) throw new RuntimeException("Deque is full");

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        deque[rear] = data;
        size++;
    }

    // Remove element from the front
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        int data = deque[front];
        // Shift elements to the left
        for (int i = front; i < rear; i++) {
            deque[i] = deque[i + 1];
        }
        rear--;
        size--;

        if (isEmpty()) front = rear = -1; // Reset when empty
        return data;
    }

    // Remove element from the rear
    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        int data = deque[rear];
        rear--;
        size--;

        if (isEmpty()) front = rear = -1; // Reset when empty
        return data;
    }

    // Peek first element
    public int peekFirst() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return deque[front];
    }

    // Peek last element
    public int peekLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return deque[rear];
    }

    // Get size of the deque
    public int size() {
        return size;
    }

    // Print deque elements
    public void printDeque() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(deque[i] + " ");
        }
        System.out.println();
    }
}
public class deque {
    public static void main(String[] args) {

    }
}
