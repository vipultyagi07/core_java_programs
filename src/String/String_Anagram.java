/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
 For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.*/
import java.io.*;
import java.util.*;

public class String_Anagram {
 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        String A=a.toUpperCase();
        String B=b.toUpperCase();
         int n=a.length();
         int count=0;
           
           int m=b.length();
           if(n!=m)
           {
               System.out.println("Not Anagrams");
           }
           else
    {
        char[] arr=new char[20];
        char c;
 char[] arr1=new char[20];
    arr=A.toCharArray();
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
               c=arr[i];
               arr[i]=arr[j];
               arr[j]=c;
            }
            else 
            {
                continue;
            }
        } 
    }
    arr1=B.toCharArray();
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr1[i]>arr1[j])
            {
               c=arr1[i];
               arr1[i]=arr1[j];
               arr1[j]=c;
            }
            else 
            {
                continue;
            }
        } 
    }
    
    
for(int k = 0;k<n;k++)
{
 if(arr[k]==arr1[k])
 {
     count++;
 }
 
}
 if(count==n&&count==m)
 {
 System.out.println("Anagrams");    
 }        
   else
 {
 System.out.println("Not Anagrams");    
 }          
        }
        
        
        
     
        
    }
}

    

