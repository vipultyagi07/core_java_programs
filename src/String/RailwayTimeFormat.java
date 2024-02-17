package String;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String h,m,sec,time;
    String str="";
    int hour,i;
    
    h=s.substring(0,2);
    m=s.substring(3,5);
    sec=s.substring(6,8);
    time=s.substring(8,10);
    char[] c=new char[20];
    char[] c1=new char[20];
     c=time.toCharArray();
     
     if(c[0]=='A')
     {
       
        hour=Integer.valueOf(h);
        if(hour==12)
        {
          str=str+"00";
       str=str+":";
       str=str+m;
       str=str+":";
       str=str+sec;
       //str=str+"AM";
       return str;}
        
        else
      {str=str+h;
       str=str+":";
       str=str+m;
       str=str+":";
       str=str+sec;
       //str=str+"AM";
       return str;
        }
    }
    else{
       hour=Integer.valueOf(h);
       if(hour==12)
       {
        str=str+hour;
       str=str+":";
       str=str+m;
       str=str+":";
       str=str+sec;
       //str=str+"PM";
       
       return str;
         
       }
       else{
       hour=hour+12;
       str=str+hour;
       str=str+":";
       str=str+m;
       str=str+":";
       str=str+sec;
       //str=str+"PM";
       
       return str;
       }
       
       
        }
  }

}
public class RailwayTimeFormat {
    public static void main(String[] args)  {
        
      Result r=new Result();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the time fromat in HH:MM:SSAM or HH:MM:SSPM");
        String s = sc.nextLine();

        String result = r.timeConversion(s);

        System.out.println(result);
    }
}
