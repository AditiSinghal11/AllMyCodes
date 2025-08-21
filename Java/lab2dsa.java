import java.util.* ;
public class lab2dsa {
    int i,j;
    //taking the input
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 System.out.println("enter the element in the matrix for the ("+i+","+j+")th position");
                 arr[i][j]=sc.nextInt();}}

       //updating the matrix
     for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 if (arr[i][j]==0){
                    for(int k=0;k<3;k++){
                    arr[k][j]=0;
                    arr[i][k]=0;
                     
                
             }}}}
         //printing the matrix     
         
    System.out.println("the given matrix is");
         for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                System.out.print(" "+arr[i][j]);   
             }
             System.out.println(); }





        

}}
