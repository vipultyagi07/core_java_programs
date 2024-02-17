import java.util.Scanner;
class MYMainMethod
{
    private int id;
    private float salary;
    private String name;

    public MYMainMethod(int a, float b,String s) // constructor is none other than a setter, that's all
    {   id=a;
        salary=b;
        name=s;   

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

public class P9_Constructor {
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     
     System.out.println("Enter the name of employee");
     String sa=s.nextLine();
     System.out.println("Enter the id of employee");
     int a=s.nextInt();
     
     System.out.println("Enter the salary of employee");
     float b=s.nextFloat();


     

     MYMainMethod vip=new MYMainMethod(a, b, sa);

     System.out.println(vip.getid());
     
       


    }
    
}
