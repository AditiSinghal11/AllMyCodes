public class linkedlist1 {
    Node head; // Head of the list

    // Node class representing each element in the list
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the end and insert the new node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // Main method to demonstrate the linked list
    public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();

        // Inserting elements
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Printing the list
        list.printList(); // Output: 10 20 30
    }
}

