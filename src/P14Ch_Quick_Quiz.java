import java.util.*;

public class P14Ch_Quick_Quiz {
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] arr={9,8,7,6,5,4,3,2,1};
        
        

        int count=0;
        do{
            System.out.println("Enter the index of array ");
            int i=s.nextInt();
        try{  
        System.out.println(arr[i]);
        count=0;
        }

        catch(Exception e)
        {   System.out.println("wrong index");
            count++;
        }
    }
        while(count>0);

    
        
    }
}
