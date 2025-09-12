public class queue5 {
    //double ended queue
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    class Deque{
        Node front,rear;
        Deque(){
            front=rear=null;
        }
        boolean isEmpty(){
            return front==null;
        }
        void insertFront(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                front=rear=newnode;
            }else{
                newnode.next=front;
                front.prev=newnode;
                front=newnode;
            }
            System.out.println(data+" inserted at front");
        }
        void insertRear(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                front=rear=newnode;
            }else{
                rear.next=newnode;
                newnode.prev=rear;
                rear=newnode;
            }
            System.out.println(data+" inserted at rear");
        }
        void deleteFront(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return;
            }
            int data=front.data;
            front=front.next;
            if(front!=null){
                front.prev=null;
            }else{
                rear=null;
            }
            System.out.println(data+" deleted from front");
        }
        void deleteRear(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return;
            }
            int data=rear.data;
            rear=rear.prev;
            if(rear!=null){
                rear.next=null;
            }else{
                front=null;
            }
            System.out.println(data+" deleted from rear");
        }
        void display(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return;
            }
            Node current=front;
            System.out.print("Deque elements: ");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue5 obj=new queue5();
        Deque dq=obj.new Deque();
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(30);
        dq.display();
        dq.deleteFront();
        dq.display();
        dq.deleteRear();
        dq.display();
    }

}
