import java.util.*;
public class dsaprac1 {
    public static void main(String[] args) {
        int[][] m= new int[3][3];
        System.out.println("enter the elements of the matrix");
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                m[i][j]=sc.nextInt();
            }
        }


       //count the total no. of 0s and 1s in the matrix
       int count0=0,count1=0;
       for (int i=0;i<3;i++){
           for (int j=0;j<3;j++){
               if (m[i][j]==0)
                   count0++;
               else if (m[i][j]==1)
                   count1++;
           }
       }
       System.out.println("Total no. of 0s: "+count0);
       System.out.println("Total no. of 1s: "+count1);
   }

}
