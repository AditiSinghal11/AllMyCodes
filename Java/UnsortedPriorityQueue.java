// ---------- Unsorted Priority Queue using Linked List ----------
class Node {
    int key;           // priority
    String value;      // data
    Node next;         // pointer to next node

    Node(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class UnsortedPriorityQueue {
    Node head;

    // Insert at end (O(1))
    void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Find node with minimum key (O(n))
    Node findMin() {
        if (head == null) return null;
        Node min = head;
        Node temp = head.next;
        while (temp != null) {
            if (temp.key < min.key)
                min = temp;
            temp = temp.next;
        }
        return min;
    }

    // Remove node with minimum key (O(n))
    void removeMin() {
        if (head == null) return;

        Node min = head, prevMin = null;
        Node curr = head, prev = null;

        while (curr != null) {
            if (curr.key < min.key) {
                min = curr;
                prevMin = prev;
            }
            prev = curr;
            curr = curr.next;
        }

        if (prevMin == null) head = head.next;
        else prevMin.next = min.next;
    }

    // Display queue
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("(" + temp.key + "," + temp.value + ") -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        UnsortedPriorityQueue pq = new UnsortedPriorityQueue();

        pq.insert(4, "Eat");
        pq.insert(2, "Study");
        pq.insert(5, "Sleep");
        pq.insert(1, "Code");

        System.out.println("Priority Queue (Unsorted):");
        pq.display();

        System.out.println("\nMin element: " + pq.findMin().value);
        pq.removeMin();

        System.out.println("After removing min:");
        pq.display();
    }
}
