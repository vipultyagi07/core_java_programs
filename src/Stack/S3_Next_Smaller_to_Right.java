package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class S3_Next_Smaller_to_Right {

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();
        int [] a={6,2,5,4,5,1,6};

        for(int i=a.length-1;i>=0;i--)
        {
            if(s.size()==0)
            {
                al.add(-1);
            }

            else if(s.size()>0&&a[i]>s.peek())
            {
                al.add(s.peek());
            }

            else if(s.size()>0&&a[i]<=s.peek())
            {
                while(s.size()>0&&a[i]<=s.peek())
                {
                    s.pop();
                }

                if(s.size()==0)
                {
                    al.add(-1);

                }
                else {
                    al.add(s.peek());
                }
            }

            s.push(a[i]);
        }

        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(" "+al.get(i));
        }

    }
}
