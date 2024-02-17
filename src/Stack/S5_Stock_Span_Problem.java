package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class S5_Stock_Span_Problem {
    public static void main(String[] args) {

        ArrayList<Integer>  al=new ArrayList<>();
        ArrayList<Integer>  index=new ArrayList<>();

        int a[]={10,20,100,80,60,200,70,60,75,85};
        int b[]=new int[a.length];
        Stack<Integer> s=new Stack<>();

        int k=0;
//Brute Force
//        for(int i=a.length-1;i>=0;i--)
//        { int count =0;
//            for(int j=i;j>=0;j--)
//            {
//                if(a[i]>=a[j])
//                {count++;}
//                else
//                {break;}
//            }
//            b[k++]=count;
//        }
//
//        for(int i=0;i<a.length;i++)
//        {System.out.print(" "+a[i]);}
//
//        System.out.println();
//
//        for(int i=a.length-1;i>=0;i--)
//        {System.out.print(" "+b[i]+" ");}


        for(int i=0;i<a.length;i++)
        {
            if(s.size()==0)
            {
              al.add(-1);
                index.add(i+1);

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
                    index.add(i+1);
                }

                else
                {
                    al.add(s.peek());
                    index.add(i-(al.indexOf(s.peek())-1));
                }
            }

            else if(s.size()>0&&a[i]<=s.peek())
            {
                al.add(s.peek());
                index.add(i-(al.indexOf(s.peek())-1));
            }

            s.add(a[i]) ;
        }

        System.out.println(al);
        System.out.println(index);
    }
}
