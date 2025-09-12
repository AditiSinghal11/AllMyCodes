public class queue2 {
    //implement queue using linked list
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
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
            if(front==null){
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
    }
    public static void main(String[] args) {
        queue2 obj=new queue2();
        Queue q=obj.new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.display();
        q.enqueue(30);
        q.enqueue(40);      
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();}
    }