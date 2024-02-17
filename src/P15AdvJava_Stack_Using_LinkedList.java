public class P15AdvJava_Stack_Using_LinkedList {
    public static Node head=null;// we have to  make the classes and variable static beacause, for say "head" is single and the node
    //                              we are implementing is also single in case of stack or go to page no. 51-52 of notebook
    
    static class Node  
    {
        int data;
        Node next;
        Node(int data)
        {
          this.data=data;
          this.next=null;  
        }
    }
    static class stack
    {   

        
        
        public static void  push(int n)
        {  Node newNode= new Node(n);
            
            newNode.next=head;
            head=newNode;
            

            
        }
        public static int pop()
        {
           int x;
           x=head.data;
           head=head.next;
           return x;
        }

        public static int peek()
        {
            Node n;
            n=head;
            return n.data;

        }

        
    }
    

    public static void main(String[] args)
    {
        P15AdvJava_Stack_Using_LinkedList list=new  P15AdvJava_Stack_Using_LinkedList();
        stack s=new stack();
        s.push(5);
        s.push(6);
        s.push(7);
        //System.out.println(s.pop());
        
        System.out.println(s.pop());
        
        
        System.out.println(s.peek());
        

        
    }

    
}
