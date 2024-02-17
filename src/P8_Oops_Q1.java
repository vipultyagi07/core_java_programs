import java.util.Scanner;
class Employee1{
int salary;
String name;
Scanner c=new Scanner(System.in);

public void  getname()
{ System.out.print("Enter the Name");
 name=c.nextLine();

}
public void  getsalary()
{System.out.println("Enter the salary");
 salary=c.nextInt();
}
//c.nextLine();



public void getdetail()
{
 System.out.printf("\nSalary=%d\n",salary);
 System.out.print("Name:");
 System.out.println(name);
 
}

}
public class P8_Oops_Q1 {

  public static void main(String[] args)
  {
    Employee1 vipul=new Employee1();

    
    vipul.getname();
    vipul.getsalary();
    
    vipul.getdetail();

  }  
}
