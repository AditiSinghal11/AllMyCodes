public class array3 {
    public static void main(String[] args) {
 //creating a 2X3 matirx       
 int[][] m1 ={
     {2, 3, 4},
     {5, 2, 3}
 };
 int[][] m2 ={
     {-4, 5, 3},
     {5, 6, 3}
 };
 int[][] m3 = new int[2][3];
 //printing the matrix with the sum of m1 and m2
 for (int i = 0; i < m1.length; i++) {
     for (int j = 0; j < m1[i].length; j++) {
         m3[i][j] = m1[i][j] + m2[i][j];
         System.out.print(m3);
     }
     System.out.println();
 }
}}

