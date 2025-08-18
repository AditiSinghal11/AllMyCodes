public class linkedlist2 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public static void main( String[] args){
        Node first=new Node(10);
        Node second=new Node(10);
        Node third=new Node(10);
        Node fourth =new Node(10);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;


    }
    
    public void printlist(){
        Node current=head;
        if(current==null){
            System.out.print("the list is empty");
            return;

        }
        while(current.next!=null){
            System.out.print(current.data+" ");
            current=current.next;}



        }


    }


