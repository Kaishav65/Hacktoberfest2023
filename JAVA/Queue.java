/*
 * This java file contains the essential functions required to run the QueueProgram.java program.
 */
class Queue {
    private static final int MAX_SIZE = 10;
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        queueArray = new int[MAX_SIZE];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        if (rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear++;
        }

        queueArray[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int item = queueArray[front];
        front++;
        size--;

        if (front > rear) {
            front = -1;
            rear = -1;
        }

        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return queueArray[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}