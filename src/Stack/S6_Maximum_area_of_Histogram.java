package Stack;

import java.util.*;

public class S6_Maximum_area_of_Histogram {

    public static void main(String[] args) {

        Integer  a[] = {6, 2, 5, 4, 5, 1, 6};
        ArrayList<Integer> al=new ArrayList<Integer>();
           int max = 0;
           int area;
        for (int i = 0; i < a.length; i++) {
            area=a[i]*(nsri(i,a)-nsli(i,a)-1);

            if(area>max)
            {
                max=area;
            }
        }
        System.out.println(max);


    }

    private static int nsli(int e, Integer[] a) {
        List<Integer> l = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        ArrayList<Integer> in=new ArrayList<Integer>();


        for (int i = 0; i < a.length; i++) { // here we are finding the nsl and storing their index simultaneously
            if (s.size() == 0) {
                l.add(-1);
                in.add(-1);

            } else if (s.size() > 0 && a[i] <= s.peek()) {
                while (s.size() > 0 && a[i] <= s.peek()) {
                    s.pop();
                }
                if (s.size() == 0) {
                    l.add(-1);
                    in.add(-1);

                } else {

                    l.add(s.peek());
                    in.add(l.indexOf(s.peek()) - 1);

                }

            } else if (s.size() > 0 && a[i] > s.peek()) {
                l.add(s.peek());
                in.add(l.indexOf(s.peek()) - 1);

            }

            s.push(a[i]);
        }

        return in.get(e);

    }


    private static int  nsri(int e,Integer[] a) // here we are finding the nsr and storing their index simultaneously
    { Stack<Integer> s=new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> in= new ArrayList<>();
        for(int i=a.length-1;i>=0;i--)
        {
            if(s.size()==0)
            {
                al.add(-1);
                in.add(-1);
            }

            else if(s.size()>0&&a[i]>s.peek())
            {
                al.add(s.peek());
                in.add(al.indexOf(s.peek())-1);
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
                    in.add(-1);

                }
                else {
                    al.add(s.peek());
                    in.add(al.indexOf(s.peek())-1);
                }
            }

            s.push(a[i]);
        }
        Collections.reverse(in); // because in the NSR approach we start adding our elements
                                 // from back side so we have to reverse it

        if(in.get(e)<0)
        {
            return -1;
        }

        else
        {
            return (al.size()-1-in.get(e));
        }




    }


}

