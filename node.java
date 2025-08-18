public class node {
    node head;
    int data;
    int next;
    node(int data){
        this.data=data;
        this.next=next;
    
    }
    public static void main(String[] args){
        node first = new node(10);
        node second = new node(20);
        node third = new node(30);  
    }
    //print the linked list
    public void printlist(){
        node current = head ;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
// reverse the list
    public node reverse(node head) {
        node prev = null;
        node current = head;
        node next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to next node
        }
        return prev; // New head of the reversed list
    } 

    
}
