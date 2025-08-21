
import java.util.Scanner;

public class lab1{
     int add(int a, int b){
        int c=a+b;
        return c;
    }
     int sub(int a, int b){
        int d=a-b;
        return d;
    }
     int mult(int a, int b){
        int e=a*b;
        return e;
    }
     int div(int a, int b){
        int f=a/b;
        return f;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number1:");
        int a=s.nextInt();
        System.out.println("enter the number2:");
        int b=s.nextInt();
        lab1 x=new lab1();
        int c=x.add(a,b);
        int d=x.sub(a,b);
        int e=x.mult(a,b);
        int f=x.div(a,b);
        System.out.println("sum="+c);
        System.out.println("diff="+d);
        System.out.println("mult="+e);
        System.out.println("div="+f);
        
    }
}