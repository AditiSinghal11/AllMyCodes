class CircularLinkedList {
    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node last; // points to the last node

    public CircularLinkedList() {
        last = null;
    }

    // Insert at the start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode; // new node becomes the last node
        }
    }

    // Display the list
    public void display() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = last.next; // first node
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtStart(5);
        cll.insertAtEnd(30);
        cll.insertAtStart(1);

        System.out.println("Circular Linked List:");
        cll.display();
    }
}
