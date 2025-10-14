// ---------- Sorted Priority Queue using Linked List ----------
class NodeSorted {
    int key;
    String value;
    NodeSorted next;

    NodeSorted(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class SortedPriorityQueue {
    NodeSorted head;

    // Insert keeping list sorted by key (O(n))
    void insert(int key, String value) {
        NodeSorted newNode = new NodeSorted(key, value);

        // Insert at beginning if list empty or smaller than head
        if (head == null || key < head.key) {
            newNode.next = head;
            head = newNode;
            return;
        }

        NodeSorted curr = head;
        while (curr.next != null && curr.next.key <= key)
            curr = curr.next;

        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Return min element (O(1))
    NodeSorted min() {
        return head;
    }

    // Remove min (first node) (O(1))
    void removeMin() {
        if (head != null)
            head = head.next;
    }

    void display() {
        NodeSorted temp = head;
        while (temp != null) {
            System.out.print("(" + temp.key + "," + temp.value + ") -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SortedPriorityQueue pq = new SortedPriorityQueue();

        pq.insert(4, "Eat");
        pq.insert(2, "Study");
        pq.insert(5, "Sleep");
        pq.insert(1, "Code");

        System.out.println("Priority Queue (Sorted):");
        pq.display();

        System.out.println("\nMin element: " + pq.min().value);
        pq.removeMin();

        System.out.println("After removing min:");
        pq.display();
    }
}
