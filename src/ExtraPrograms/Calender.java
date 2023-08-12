package ExtraPrograms;
//import java.io.*;
import java.util.*;
import java.time.*;

public class Calender {
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the date in format of YYYY MM DD");
    
     int year=s.nextInt();
     int month=s.nextInt();
     int day=s.nextInt();
     LocalDate str;
     DayOfWeek str1;
     String str2;

   
    str=LocalDate.of(year, month, day);
    str1=str.getDayOfWeek();
     str2=str1.name();
     System.out.println(str2);

       
}
}