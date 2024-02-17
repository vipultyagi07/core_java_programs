import java.util.*;
public class P15AdvJava_Stack_Using_Collection_Framework {
    public static void main(String[] args)
    {  Scanner sc=new Scanner(System.in);
      Stack<Integer> s=new Stack<>();
      System.out.println("How many numbers do you want to enter");
      int n=sc.nextInt();
      System.out.println("Enter "+ n +" numbers");
      int i;
      for(i=0;i<n;i++)
      {
          s.push(sc.nextInt());
      }
      s.pop();
         int a=s.peek();
         System.out.println(a);
      s.pop();

     
    //  System.out.println();
      //System.out.println(s.empty());
        System.out.println(s.size());
    }
    
}
