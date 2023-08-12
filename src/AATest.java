import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
class AATest {
    public static void main(String args[] ) throws IOException {
//        Scanner sc=new Scanner(System.in);
//        int  n=sc.nextInt();
//        int k=sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String ip[] =  br.readLine().split(" ");
        int n = Integer.parseInt(ip[0]);
        int k = Integer.parseInt(ip[1]);

        List <Integer> Period=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            String[] arr_in_out_time = br.readLine().split(" ");
            int timein=Integer.parseInt(arr_in_out_time[0]);
            int timeout=Integer.parseInt(arr_in_out_time[1]);

            while(timein<timeout)
            {
                Period.add(timein);
                timein++;
            }
        }
        int count=0;
        Set <Integer> set=new HashSet<Integer>();
        set.addAll(Period);
        List <Integer> value=new ArrayList<Integer>();
        value.addAll(set);
        for(int i=0;i<value.size();i++)
        {
            int a=value.get(i);
            int countfeq = Collections.frequency(Period,a);
            if(countfeq>=k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}