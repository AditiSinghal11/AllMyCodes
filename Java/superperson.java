class Person{
    String name;
    Person(String name){
        this.name=name;

    }
class Student extends Person{
    int rollno;
    Student(String name,int rollno){
        super(name);
        this.rollno=rollno;

    }
    void display(){System.out.println("name;"+name+"roll no:"+rollno);}

}
}
public class superperson {
    public static void main(String[] args){
        Person s = new Person("aditi");
        Student d = new Student("aditi",2);

        

    }

    
}
