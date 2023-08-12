package Array;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int n=arr.size();
        int i,j;
        int sum1=0,sum2=0;
        int ans;
        
        for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
          {
             if(i==j)
             {
               sum1=sum1+arr.get(i).get(j);
             }
             if((i+j)==(n-1))
             {
               sum2=sum2+arr.get(i).get(j);
             }
          }
        }
        if((sum1-sum2)<0)
        {
          ans=(sum1-sum2)*(-1);
          
        }
        else if((sum2-sum1)<0)
        {
          ans=(sum2-sum1)*(-1);
          
        }
        else
        {
          ans=sum1-sum2;
        }
        
        return ans;
        
    }

}

public class DiagonalDiff_ArrayList {

    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();

         int n=s.nextInt();
         int i;
         int j;

         for (i = 0; i <n; i++) {
                for(j=0;j<n;j++)
                {
                  arr1.add(s.nextInt());
                }
                 arr.add(arr1);
              }


              System.out.println(arr);
              System.out.println(arr1);


    }
    
}
