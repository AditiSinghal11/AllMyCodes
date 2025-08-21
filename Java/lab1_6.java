import java.util.*;
public class lab1_6 {
    double dis(double a,double b,double c){
    double d=(b*b)-(4*a*c);
    return d;
    }
    double roots(double a, double b){
        double sqrt=Math.pow(((a+b)/2),1/2.0);
        return sqrt;
        }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a,b,c ,d;
        System.out.println("enter the value of a");
        a=s.nextDouble();
        System.out.println("enter the value of b");
        b=s.nextDouble();
        System.out.println("enter the value of c");
        c=s.nextDouble();
        lab1_6 x=new lab1_6();
        lab1_6 x1=new lab1_6();
        System.out.println(" discriminant= "+ x.dis(a,b,c));
        System.out.println(" square root= "+ x1.roots(a,b));



    }
} 
    

