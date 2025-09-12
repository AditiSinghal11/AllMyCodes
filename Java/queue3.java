public class queue3 {
    //implementing queue using doubly linked list
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    class Queue{
        Node front,rear;
        int size;
        Queue(){
            front=rear=null;
            size=0;
        }
        boolean isempty(){
            return size==0;
        }
        void enqueue(int data){
            Node newnode=new Node(data);
            if(rear==null){
                front=rear=newnode;
            }else{
                rear.next=newnode;
                newnode.prev=rear;
                rear=newnode;
            }
            size++;
            System.out.println(data+" enqueued to queue");
        }
        void dequeue(){
            if(isempty()){
                System.out.println("Queue is empty");
                return;
            }
            int data=front.data;
            front=front.next;
            if(front!=null){
                front.prev=null;
            }else{
                rear=null;
            }
            size--;
            System.out.println(data+" dequeued from queue");
        }
        void display(){
            if(isempty()){
                System.out.println("Queue is empty");
                return;
            }
            Node current=front;
            System.out.print("Queue elements: ");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
        void getfront(){
            if(isempty()){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Front element is: "+front.data);
        }
        void getrear(){
            if(isempty()){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Rear element is: "+rear.data);
        }

    }
    public static void main(String[] args) {
        queue3 obj=new queue3();
        Queue q=obj.new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.getfront();
        q.getrear();
        q.display();
        q.dequeue();
        q.display();
    }
}
