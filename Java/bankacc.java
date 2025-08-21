public class bankacc {
    int accountBalance=1000;
    static double interestrate=5.0;
    public static void main(String[] args){
        bankacc cus1=new bankacc();
        bankacc cus2=new bankacc();
        cus1.accountBalance=5000;
        cus2.accountBalance=3000;
        bankacc.interestrate=6.5;
        System.out.println(cus1.accountBalance);
        System.out.println(cus2.accountBalance);
        System.out.println(bankacc.interestrate);


    }
}
