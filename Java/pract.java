public class pract{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    class stack{
         Node top;
        stack(){
         
            this.top=null;

        }
        boolean isempty(){
            return top==null;

        }
        void push(int data){
            Node newnode=new Node(data);
            newnode.next=top;
            top=newnode;
          
        }
        int pop(){
            if(isempty()){
                System.out.println("the stack is empty");
                return -1;
            }
            int data=top.data;
            top=top.next;
            return data;
        
        }
      void display(){
            if (isempty()){
                System.out.println("nothing to display the stack is empty");
                return;
            }
           Node current=top;
            while(current!=null){
                System.out.println(current.data+" ");
                current=current.next;

            }
            System.out.println();
        }
    }
    
}

 