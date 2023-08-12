

import java.util.*;
public class P15AdvJava_Stack_Using_ArrayList {
    public static class stack
    { static ArrayList<Integer> list=new ArrayList<>();

        public static void push(int n)
        { 
            list.add(n);
        }
        public static int pop()
        {
            int n=list.size();
            int pop=list.get(n-1);
            list.remove(n-1);
            return pop;
            


        }
        public static int peek()
        {
            int n=list.size();

            return list.get(n-1);
            

        }

    }
    public static void main(String[] args)
    {  Scanner sc=new Scanner(System.in);
      stack s=new stack();
       System.out.println("How many numbers do you want to enter");
       int n=sc.nextInt();
       System.out.println("Enter "+ n +" numbers");
       int i;
       for(i=0;i<n;i++)
       {
           s.push(sc.nextInt());
       }
       for(i=0;i<n;i++)
       {
       System.out.print(" "+ s.pop());

       }


    }
    
}
