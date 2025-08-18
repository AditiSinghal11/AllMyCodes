import java.util.Scanner;
//rotate the array to the right by k steps

public class lab3dsa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("enter the steps to roate to the right");
        int k = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        // Rotate the array to the right by k steps
    for (int j=1;j<=k;j++){
        int temp=arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
       }
        System.out.println("Array after rotating to the right by " + k + " steps:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}