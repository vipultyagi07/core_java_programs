import java.util.Scanner;
public class Prime_No_By_While {

    public static void main(String[] args)
    {   Scanner s=new Scanner(System.in);
        System.out.println("enter the upper limit for prime no if lower limit is 2");
        
        int n=s.nextInt();
        int i=2,j,count=0;
        while(i<=n)
        {count=0;
            j=2; 
            while(j<n)
        {
            if(i%j==0)
            {
              count++;
            }
     j++;
     
        }
     
      if(count==1)
         System.out.printf("prime no is %d \n",i);
         i++;
     
        }






    }
    
}
