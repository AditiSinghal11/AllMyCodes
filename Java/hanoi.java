public class hanoi{
    void hanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }
        hanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        hanoi(n - 1, auxiliary, destination, source);
    }
    public static void main(String[] args) {
        hanoi h = new hanoi();
        h.hanoi(3, 'A', 'C', 'B');
    }
    
}