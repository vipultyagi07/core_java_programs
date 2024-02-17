
import java.util.Scanner;
class Employee
{
    int id;
    String name;
    float salary;
    int [] arr=new int[12];
    Scanner p=new Scanner(System.in);

 public void printid()
 {
     System.out.printf("\nid is %d",id);
 }
 public void printname()
 {   System.out.println("name : ");
     System.out.println(name);
 }
 public void printsalary()
 {
     System.out.printf("\nSalary is equal to %.1f",salary);
 }
 public void getstring()
 {
  name=p.nextLine();

 }
 public void getperformance()
 {
   System.out.println("for how many months record you want to print");
   int n=p.nextInt();
   System.out.printf("\nEnter detail of %d months",n);
   int i;
   for(i=0;i<n;i++)
   {
       arr[i]=p.nextInt();
   }

 }
 

}



public class P8_Oops_CustomClass {

    public static void main(String[] args)
    {  Scanner s=new Scanner(System.in);
       Employee vipul=new Employee();
       Employee akash=new Employee();

       System.out.println("Enter the \nid\nname\nsalary\nperfomance of VIPUL");
    
       vipul.id=s.nextInt();
       vipul.getstring();
       vipul.salary=s.nextFloat();
       vipul.getperformance();
       

       
       

       System.out.println("Enter the \nid\nname\nsalary\nperfomance of AKASH");
      
       akash.id=s.nextInt();
       akash.getstring();
       akash.salary=s.nextFloat();
       akash.getperformance();


       System.out.println("Data of VIPUL ");
       vipul.printid();
       vipul.printname();
       vipul.printsalary();
       System.out.println();
       for(int i=0;i<12;i++)
       {
        System.out.printf("\nPERFORMANCE OF %d month is %d ",i,vipul.arr[i]);
       }

       System.out.println("Data of AKASH ");
       akash.printid();
       akash.printname();
       akash.printsalary();
       
       for(int i=0;i<12;i++)
       {
           System.out.printf("\nPERFORMANCE OF %d month is %d ",i,akash.arr[i]);
       }


       

    } 

    
}
