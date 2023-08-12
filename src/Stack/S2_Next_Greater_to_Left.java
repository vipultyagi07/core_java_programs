package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class S2_Next_Greater_to_Left {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        int[] a = {1,3,2,4};
        int[] b= new int[a.length];
        int k=0;
        // BRUTE FORCE

        // BRUTE FORCE//
//        for (int i =a.length-1; i>=0; i--) {
//            int count=0;
//            for (int j = i - 1; j >=0; j--) {
//                if (a[i] < a[j]) {
//                     b[k]=a[j];
//                    //System.out.print(" "+b[k]);
//                     k++;
//
//                    break;
//                }
//                count++;
//            }
//            if(count==i)
//            {
//              b[k]=-1;
//              k++;
//            }
//        }
//        for(k=a.length-1;k>=0;k--)
//        {
//            System.out.print(" "+b[k]);
//        }

     for(int i=0;i<a.length;i++)
     {
         if(s.size()==0)
         {
             al.add(-1);
         }

         else if(s.size()>0&&a[i]<s.peek())
         {
             al.add(s.peek());
         }
         else if(s.size()>0&&a[i]>=s.peek())
         {
             while(s.size()>0&&a[i]>=s.peek())
             {
                 s.pop();

             }

             if(s.size()==0)
             {
                 al.add(-1);
             }
             else
             {
                 al.add(s.peek());
             }

         }

         s.push(a[i]);

     }

     for(int i=0;i<a.length;i++)
     {
         System.out.print(" "+al.get(i));
     }

    }

}
