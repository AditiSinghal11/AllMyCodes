import java.util.Scanner;
public class q1 {
	int num (int a)
	{
		if (a<0) {
		 System.out.println("negative");
		}
		if (a>0) {
			System.out.println("positive");
		}
		else
		{
			System.out.println("zero");			
		}
		return 0;
		
	}
	public static void main(String arg[]){
		Scanner s= new Scanner(System.in);
		System.out.print("enter a");
		int a=s.nextInt();
		q1 obj=new q1();
		obj.num(a);
	} {
    
}}
