import java.util.*;
public class P15AdvJava_LinkedList {
    Node head;
    class Node
{
    int data;
    Node next;
   Node(int data)
   {
       this.data=data;
       this.next=null;

   }

}

// add-- first
public void addfirst(int data) // isme hm suru se hi element enter kar rahe hai 
{ 
    Node newnode =new Node(data);
    if(head == null) // kya abhi tak koi linked list exist bhi karti hai ya nahi agar nahi to hame kisi bhi "next" ko kahi point nahi karwana 
                     // qki jo hmara naya node hoga vo ek head ke roop mai hi enter hoga agar linked list khali hai
    {
       head=newnode;
       return;
         
    }
    newnode.next=head; // matlab agle wala jo ki  head hai vo ab naye wale node ka "next" ban gya hai
    head=newnode;     // ab head jo hai vo naya node ban gya hai 

}
// add-- last
public void addlast(int data)
{
    Node newnode =new Node(data);
    if(head == null) // kya abhi tak koi linked list exist bhi karti hai ya nahi agar nahi to hame kisi bhi "next" ko kahi point nahi karwana 
                     // qki jo hmara naya node hoga vo ek head ke roop mai hi enter hoga agar linked list kahali hai
    {
       head=newnode;
       return; // it is very necessary 
         
    }

    Node CurrNode;
    CurrNode=head; // ye hamne isliye rakha qki head ki original value ko koi farak nahi padna chaiye or ye initialise 
                   //  ho gya hai first position par

    while(CurrNode.next!=null)
    {
        CurrNode=CurrNode.next;

    }
    CurrNode.next=newnode;  // jo sabse last wali node(currNode) hai uske "next" mai ab jo hamari newnode ka address hai vo save ho jayega or
                            // or data usme already hai to bas hamne uska address point karana hai


}
// Delete --> first
public void deletefirst()
{
  if(head==null)
  {
      System.out.println("linked list is empty");
      return;
  }   

        
   head=head.next;  // ye humne override kar diya 


}
// delete --> Last
public void deletelast()
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


// printing the linked list
public void print()
{
    Node CurrNode;
    

    CurrNode=head;
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
   
       public static void main(String[] args)
    {
        P15AdvJava_LinkedList list =new P15AdvJava_LinkedList();
        list.addfirst(1);
        list.addfirst(2);
        list.addlast(5);
        list.addfirst(95);
       
        
        list.deletefirst();
        list.deletelast();
        list.print();







    }
    
}
