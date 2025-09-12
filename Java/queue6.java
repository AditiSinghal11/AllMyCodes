public class queue6 {
    //create a deque of strings
    class Node{
        String data;
        Node next,prev;
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    class Deque{
        Node front,rear;
        int size;
        Deque(){
            front=rear=null;
            size=0;
        }
        boolean isEmpty(){
            return size==0;
        }
        void insertFront(String data){
            Node newnode=new Node(data);
            if(isEmpty()){
                front=rear=newnode;
            }else{
                newnode.next=front;
                front.prev=newnode;
                front=newnode;
            }
            size++;
            System.out.println(data+" inserted at front");
        }
        void insertRear(String data){
            Node newnode=new Node(data);
            if(isEmpty()){
                front=rear=newnode;
            }else{
                rear.next=newnode;
                newnode.prev=rear;
                rear=newnode;
            }
            size++;
            System.out.println(data+" inserted at rear");
        }
        void deleteFront(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return;
            }
            String data=front.data;
            front=front.next;
            if(front!=null){
                front.prev=null;
            }else{
                rear=null;
            }
            size--;
            System.out.println(data+" deleted from front");
        }
        void deleteRear(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return;
            }
            String data=rear.data;
            rear=rear.prev;
            if(rear!=null){
                rear.next=null;
            }else{
                front=null;
            }
            size--;
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
        void getFront(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return;
            }
            System.out.println("Front element: "+front.data);
        }
        void getRear(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return;
            }
            System.out.println("Rear element: "+rear.data);
        }
    }
    public static void main(String[] args) {
        queue6 obj=new queue6();
        Deque dq=obj.new Deque();
        dq.insertRear("Hello");
        dq.insertFront("World");
        dq.insertRear("Java");
        dq.display();
        dq.getFront();
        dq.getRear();
        dq.deleteFront();
        dq.display();
        dq.deleteRear();
        dq.display();
    }
}