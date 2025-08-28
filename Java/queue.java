public class queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean isfull(){
        return size == capacity;
    }
    public boolean isempty(){
        return size == 0;
    }
    public void enqueue(int data){
        if (isfull()){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
        System.out.println(data + " enqueued to queue");
    }
    public void dequeue(){
        if (isempty()){
            System.out.println("Queue is empty");
            return;
        }
        int data = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(data + " dequeued from queue");
    }
    public void display(){
        if (isempty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index=(front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}
