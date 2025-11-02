package deepti;


class PQEntry {
    static class Node {
        int key;       
        int value;    
        Node prev, next;

        Node(int value, int key) {
            this.value = value;
            this.key = key;
            this.prev = this.next = null;
        }
    }

    private Node head; 
    private Node tail;
    public PQEntry() {
        head = tail = null;
    }

   
    public void insert(int value, int key) {
        Node newNode = new Node(value, key);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Inserted: value=" + value + " key=" + key);
    }

  
    private Node findMinNode() {
        if (head == null) return null;

        Node minNode = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.key < minNode.key) {
                minNode = curr;
            }
            curr = curr.next;
        }
        return minNode;
    }

   
    public Integer min() {
        Node minNode = findMinNode();
        return (minNode != null) ? minNode.value : null;
    }

   
    public Integer removeMin() {
        Node minNode = findMinNode();
        if (minNode == null) return null;
        if (minNode == head && minNode == tail) { 
            head = tail = null;
        } else if (minNode == head) {
            head = head.next;
            head.prev = null;
        } else if (minNode == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            minNode.prev.next = minNode.next;
            minNode.next.prev = minNode.prev;
        }
        return minNode.value;
    }

   
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print("(" + curr.value + "," + curr.key + ") <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

  
    public static void main(String[] args) {
    	PQEntry pq = new PQEntry();
        pq.insert(10, 3);
        pq.insert(20, 1);
        pq.insert(30, 5);
        pq.insert(40, 2);

        pq.display();

        System.out.println("Min element: " + pq.min());

        System.out.println("Removed Min: " + pq.removeMin());
        pq.display();

        System.out.println("Min element: " + pq.min());
    }
}
