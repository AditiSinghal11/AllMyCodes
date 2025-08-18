class node2 {
    int data;
    node2 next;

    node2(int data) {
        this.data = data;
        this.next = null;
    }

    // Function to find middle node
    public static node2 findMiddle(node2 head) {
        int count = 0;
        node2 current = head;

        // Count total number of nodes
        while (current != null) {
            count++;
            current = current.next;
        }

        // Traverse to the middle node
        current = head;
        for (int i = 0; i < count / 2; i++) {
            current = current.next;
        }

        return current;
    }

    public static void main(String[] args) {
        node2 first = new node2(10);
        node2 second = new node2(20);
        node2 third = new node2(30);
        first.next = second;
        second.next = third;
        third.next = null; // End of the list

        // Print the linked list
        System.out.print("Linked List: ");
        node2 current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        // Find and print the middle node
        node2 middleNode = findMiddle(first);
        System.out.println("\nMiddle Node: " + middleNode.data);
    }
}
