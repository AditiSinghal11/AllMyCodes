import java.util.Scanner;

class employ {
    int empID;
    String name, designation;
    double salary;

    employ(int empID, String name, String designation, double salary) {
        this.empID = empID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID:" + empID + ",Name:" + name + ",designation" + designation + ",Salary:" + salary);

    }
}

public class labx {
    public static void main(String[] args){
    employ[] obj={
        new employ(101,"njnj","manager",4000.02),
        new employ(102,"dbhdbj","hr",230993),
        new employ(103,"kskj","sales",108),
        new employ(104,"jednjnd","solutioner",1209),
        new employ(105,"kdjnwedj","customer",3092137 )
    };
    Scanner s =new Scanner(System.in);
    System.out.println("2.display details of employee whos empid is 102");
    System.out.println("1.display details of employees whos salary is greater than 50k");
    System.out.println("select your choice ");
    int choice=s.nextInt();
    switch(choice){
        case 1:
            for(int i=0;i<5;i++){
                if (obj[i].salary>50000)
                {obj[i].display();}}
                break;
        case 2:
        for(int i=0;i<5;i++){
            if (obj[i].empID==102){
                obj[i].display(); }}
                break;
            }
    

 }

    }


