import java.util.*;

public class P15Advjavac_ArrayDeque {
    public static void main(String[] args)
    {  ArrayDeque<Integer> q=new ArrayDeque<>();
        q.addFirst(56);
        q.add(57);
        q.addLast(58);

        q.add(59);
        q.add(60);
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        
        
        q.removeFirst();
        q.removeLast();
        q.add(61);
        System.out.println(q.peek());
    }
    
}
