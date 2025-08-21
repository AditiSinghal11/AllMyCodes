public class employee {
    public static void main(String[] args){
        product[] obj =new product[5];
        obj[0]= new product(23232,"dell laptop");
        obj[1]=new product (23234,"HP 360");
        obj[2]=new product(89029,"Lg oled tv");
        obj[3]=new product(11100,"MI PRO NOTE MAX");
        obj[4]=new product(40001,"Kingston USB");
        System.out.println("product object one:");
        obj[0].display();
        System.out.println("product object two");
        obj[1].display();  
        System.out.println("product object three:");
        obj[2].display();
        System.out.println("product object four");
        obj[3].display();
        System.out.println("product object five:");
        obj[4].display();   }
}
class product{
    int pro_id;
    String pro_name;
    product(int pid, String n){
        pro_id=pid;
        pro_name=n;
    }
    public void display(){
        System.out.println("product id="+pro_id+" "+"product name="+pro_name);
        
    }
}