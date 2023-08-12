public class P15Advjavab_Queue_Implement_using_1LinkedList {
    

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
    static class queue
    {  static Node head=null;
        static Node tail=null;
        static int rear=0,front=0;

        public static boolean empty()
        {
           return (head==null&&tail==null);

        }

        public static void add(int data)
        {
          Node newnode=new Node(data);

          if(empty())
          {
              head=newnode;
              return;

          }
          Node currnode=head;
          

          while(currnode.next!=null)
          {
              currnode=currnode.next;

          }
          currnode.next=newnode;
          

        }

        public static int remove(){

            Node x;
            x=head;
            head=head.next;
            return x.data;

        }
        public void print()
{
    Node CurrNode;
    

    CurrNode=head;  // here current node work as  "tail"

    if(head==null)
    {
        System.out.println("NULL");
    }
    while(CurrNode!=null)
    {
        System.out.print(" "+CurrNode.data);
        CurrNode=CurrNode.next;
        

    }
    System.out.println(" NULL");
    
}
        

    }
   
    public static void main(String[] args)
    {
         queue q=new queue();
         q.add(56);
         q.add(57);
         q.add(58);

         q.add(59);
         q.add(60);
         q.remove();
         q.remove();
         q.add(61);
         q.print();


    }
}
