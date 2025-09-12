public class queue4 {
    private int maxSize;
    private int[] queue;
    private int front;
    private int rear;

    // Constructor
    public queue4(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    // Add element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % maxSize;
        queue[rear] = item;
        System.out.println(item + " enqueued to queue");
    }

    // Remove and return element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int removedItem = queue[front];

        if (front == rear) {
            // Queue becomes empty after removing the last item
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % maxSize;
        }

        System.out.println(removedItem + " dequeued from queue");
        return removedItem;
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No peek value.");
            return -1;
        }

        return queue[front];
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        queue4 q = new queue4(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        System.out.println("Front: " + q.peek());
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70); // Should show "Queue is full"
        q.display();
    }
}
