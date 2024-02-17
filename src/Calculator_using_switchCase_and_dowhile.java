import java.util.Scanner;
public class Calculator_using_switchCase_and_dowhile {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        int ko;
        do
       {System.out.println("press 1 for +\npress 2 for -\npress 3 for *\npress 4 for /\n");
        int x=s.nextInt();
        System.out.println("Enter Two no's");
        int a=s.nextInt();
        int b=s.nextInt();
        
         
        switch(x)
        {
            case 1:
            { int sum=a+b;
                System.out.printf("sum of %d and %d is %d\n",a,b,sum);
                
                
                break;
            }
            case 2:
            { int sub=a-b;
                System.out.printf("difference of %d and %d is %d\n",a,b,sub);
                
               
                break;
            } case 3:
            { int m=a*b;
                System.out.printf("multiply of %d and %d is %d\n",a,b,m);
                
                
                break;
            } case 4:
            { int d=a/b;
                System.out.printf("Quotient of %d and %d is %d\n",a,b,d);
                
                
                break;
            }



        }



     System.out.println(" do you want to re-use the calculator press 1");
       ko=s.nextInt();


    }
    while(ko==1);
    
}
}