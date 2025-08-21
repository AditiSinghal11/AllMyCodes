public class javaprac1 {
    public static void main(String args[]) {
        int a=2;
        int sumE=0;
        int sum0=0;
        int temp;
        while (a>=0){
            temp=a%10;
            if (temp %2 ==0)
                {sumE=sumE+temp;}
            else
                {sum0=sum0+temp;}
            a=a/10;
        }
        System.out.println(sumE+","+sum0);



}
    
}
