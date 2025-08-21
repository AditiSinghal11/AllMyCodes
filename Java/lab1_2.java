import java.util.*;
public class lab1_2 {
    int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int a,b,c,sum=0;
        System.out.println("enter 3 numbers:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        lab1_2 x= new lab1_2();
        System.out.println("the sum of all three numbers="+x.add(a,b,c));

    

    }
    
}
