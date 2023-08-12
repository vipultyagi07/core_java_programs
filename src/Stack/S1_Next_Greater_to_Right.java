package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class S1_Next_Greater_to_Right {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();
        int [] a={1,3,0,0,1,2,4};
    // BRUTE FORCE

    //BRUTE FORCE//        for(int i=0;i<a.length;i++)
//        {
//            for(int j=i+1;j<a.length;j++)
//            {x
//                  if(a[i]<a[j])
//                  { System.out.print(" "+a[j]);
//
//                  break;}
//                  else
//                  {
//                      System.out.print(" -1");
//                      break;
//
//                  }
//
//
//            }
//
//        }
//        System.out.println(" -1");

    // Through STACK

        for(int i=a.length-1;i>=0;i--)
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

       for(int i=al.size()-1;i>=0;i--)
       {
           System.out.print("  "+al.get(i));
       }


    }
}
