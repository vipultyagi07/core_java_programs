import java.io.*;
import java.util.*;


public class AAAA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String ip[] =  br.readLine().split(" ");
        int n = Integer.parseInt(ip[0]);
        int k = Integer.parseInt(ip[1]);
        int[][] in_out_time = new int[n][2];
        for(int i_in_out_time = 0; i_in_out_time < n; i_in_out_time++)
        {
            String[] arr_in_out_time = br.readLine().split(" ");
            for(int j_in_out_time = 0; j_in_out_time < arr_in_out_time.length; j_in_out_time++)
            {
                in_out_time[i_in_out_time][j_in_out_time] = Integer.parseInt(arr_in_out_time[j_in_out_time]);
            }
        }

        long out_ = solve(n, k, in_out_time);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static long solve(int n, int k, int[][] in_out_time){
        // Write your code here
        List<Event> events = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int checkIn =in_out_time[i][0];
            int checkOut = in_out_time[i][1];

            events.add(new Event(checkIn, 1));
            events.add(new Event(checkOut, -1));
        }

        Collections.sort(events, Comparator.comparingInt(Event::getTime));

        int maxCustomers = 0;
        int currentCustomers = 0;

        int startTime = 0;
        int panicPeriod = 0;
        boolean panic= false;
        for(Event event: events) {
            currentCustomers+=event.getValue();
            if(currentCustomers >= k && !panic) {
                panic = true;
                startTime = event.getTime();
            } else if(currentCustomers < k && panic) {
                panic = false;
                panicPeriod += event.getTime() - startTime;
            }
        }
        return panicPeriod;
    }

    static class Event {
        private int time;
        private int value;

        public Event(int time, int value) {
            this.time = time;
            this.value = value;
        }

        public int getTime() {
            return time;
        }

        public int getValue() {
            return value;
        }
    }
}