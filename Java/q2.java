import java.util.Scanner;
public class q2{
	int sume=0,sumo=0,num;
	int count(int num) {
		while (num>0) {
			int temp=num%10;
			if (temp%2==0) {
				sume=sume+temp;
				}
			else {
				sumo=sumo+temp;
			}
			num=num/10;
			}
	System.out.println("count even "+sume);
    System.out.println("count odd "+sumo);
    return 0;
	}
  public static void main(String arg[]){
	Scanner s= new Scanner(System.in);
			System.out.print("enter num");
			int num=s.nextInt();
			q2 obj=new q2();
			int c=obj.count(num);		
	} {
    
    }
}