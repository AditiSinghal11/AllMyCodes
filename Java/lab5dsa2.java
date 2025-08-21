public class lab5dsa2 {
    //implementing stack using linked list and add elements 
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class stack {
        Node top;
        stack() {
            this.top = null;
        }
        boolean isEmpty() {
            return top == null;
        }
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }
        void display() {
            Node current = top;
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                System.out.println();
                current = current.next;
            }
            System.out.println();
        }
        }
        public static void main(String[] args) {
            lab5dsa2 obj = new lab5dsa2();
            stack s = obj.new stack();
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            System.out.println("Top element is: " + s.peek());
            System.out.println("Popped element is: " + s.pop());
            System.out.println("Is stack empty? " + s.isEmpty());
            s.display();
    }

}