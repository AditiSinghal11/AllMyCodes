class inheritence2{
    void display(){
        System.out.println("cat");
    }

}
class override extends inheritence2{
    void display(){
        System.out.println("dog");
        super.display();
    }
    

}
    
public class inheritence{
    public static void main(String[] args){
    inheritence2 n=new inheritence2();
    override s=new override();
    n.display();
    s.display();

}
    
}
    

