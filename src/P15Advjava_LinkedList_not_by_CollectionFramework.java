  class Node {

    int  data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;

    }
}

public class P15Advjava_LinkedList_not_by_CollectionFramework {
    Node head;

    public void addFirst(int data) // isme hm suru se hi element enter kar rahe hai
    {
        Node newnode =new Node(data);
        if(head == null) // kya abhi tak koi linked list exist bhi karti hai ya nahi agar nahi to hame kisi bhi "next" ko kahi point nahi karwana
        // qki jo hmara naya node hoga vo ek head ke roop mai hi enter hoga agar linked list kahali hai
        {
            head=newnode; // iska matlab hai head mai ab newni=ode hai jo ki hamari "Node" class mai ban chuki
            //		data=6;
            //      next=null;   ye pehli new node hai or ab ye head ban gyi hai to koi bhi data
            //                    direct daalne ki jarrurat nahi hai constructor apne aap daal dega
            return;

        }
        newnode.next=head; // matlab agle wala jo ki  head hai vo ab naye wale node ka "next" ban gya hai
        head=newnode;     // ab head jo hai vo naya node ban gya hai

    }
    public void addLast(int data)
    { Node newnode=new Node(data);

        if(head==null)
        {
            head=newnode;
            return;
        }
        Node currentNode;
        currentNode=head;

        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }

        currentNode.next=newnode; //

    }


    public void deleteFirst()
    { 	   if(head==null)
    {
        System.out.println("List is empty");
        return;
    }
        head=head.next;
    }
    public void deleteLast()
    {	Node currentNode;
        currentNode=head;

        if(head==null)
        {
            System.out.println("List is empty");

        }

        while(currentNode.next.next!=null)
        {
            currentNode=currentNode.next;

        }

        currentNode.next=null;



    }

    public void print()
    {  Node currentNode;
        currentNode=head;

        if(head==null)
        {
            System.out.println("list is null");

        }

        while(currentNode!=null)
        {
            System.out.println(" "+currentNode.data);

            currentNode=currentNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        P15Advjava_LinkedList_not_by_CollectionFramework m=new P15Advjava_LinkedList_not_by_CollectionFramework();
        m.addLast(7);
        m.addFirst(6);
        m.addFirst(5);
        m.addFirst(4);
        m.addFirst(3);
        m.addFirst(2);
        m.addFirst(1);
        m.deleteFirst();

        m.deleteLast();
        m.deleteLast();
        m.print();





    }
}
