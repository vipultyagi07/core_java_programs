import java.util.Scanner;
class MYMainMethod1
{
    private int id;
    private float salary;
    private String name;

    public MYMainMethod1(int a, float b,String s)
    {   id=1;
        salary=1;
        name=s;   

    }
    public MYMainMethod1(int a, float b)
    {   id=2;
        salary=2;
        //name=s;   

    }
    public int getid()
    {
        return id;
    }
    public float getsalary()
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }
}
public class P9_Constructor_overloading {
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     
     System.out.println("Enter the name of employee");
     String sa=s.nextLine();
     System.out.println("Enter the id of employee");
     int a=s.nextInt();
     
     System.out.println("Enter the salary of employee");
     float b=s.nextFloat();


     

     MYMainMethod1 vip=new MYMainMethod1(a, b, sa);
     MYMainMethod1 vip1=new MYMainMethod1(a, b);
     

     System.out.println(vip.getid());
     System.out.println(vip1.getid());
       


    }

    
}


