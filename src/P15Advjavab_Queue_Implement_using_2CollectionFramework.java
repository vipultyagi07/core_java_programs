import java.util.*;
public class P15Advjavab_Queue_Implement_using_2CollectionFramework {
    public static void main(String[] args)
    {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(56);
        q.add(57);
        q.add(58);

        q.add(59);
        q.add(60);
        System.out.println(q.peek());
        System.out.println(q.peek());
        
        
        q.remove();
        q.remove();
        q.add(61);
        System.out.println(q.peek());
        
    }
    


}
