public class lab5dsa1 {
    //implementing stack using array
    class stack{
        int top;
        int[] arr;
        stack(int size){
            this.top=-1;
            this.arr=new int[size];
        }
        boolean isEmpty(){
            return top==-1;
        }
        boolean isFull(){
            return top==arr.length-1;
        }
        void push(int data){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[++top]=data;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top--];
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }
        void display(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack elements: ");
            for(int i=0; i<=top; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
    lab5dsa1 obj = new lab5dsa1();
    stack s = obj.new stack(5);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    System.out.println("Top element is: " + s.peek());
    System.out.println("Popped element is: " + s.pop());
    System.out.println("Is stack empty? " + s.isEmpty());
  System.out.println("Is stack full? " + s.isFull());
    s.display();
    
   }
}
