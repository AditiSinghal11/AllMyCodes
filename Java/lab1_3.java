import java.util.*;
public class lab1_3 {
    int area(int r){
    int a=r*r;
    return a;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,r=0;
        System.out.println("enter the side of the square");
        a=s.nextInt();
        lab1_3 x=new lab1_3();
        System.out.println(" the area of the sqaure is "+ x.area(a));



    }
}
