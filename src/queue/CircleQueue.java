package queue;

import java.util.Arrays;

public class CircleQueue {
    private int[] items;
    private int front = -1;
    private int rear = -1;

    public CircleQueue(int size) {
        this.items = new int[size];
    }

    public void enqueue(int item) {
        rear = (rear + 1) % items.length;
        this.items[rear] = item;
    }

    public int dequeue() {
        front = (front + 1) % items.length;
        var item = this.items[front];
        this.items[front] = 0;
        return item;
    }

    public void print() {
        System.out.println(Arrays.toString(this.items));
    }

}
