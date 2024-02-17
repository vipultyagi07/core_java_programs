import java.util.*;
public class P15AdvJava_LinkedList_Using_Collection_Framework {
    public static void main(String[] args)
    {   Scanner s=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<Integer>();
        LinkedList<Integer> list2=new LinkedList<>();

         System.out.println("Enter the size of of the list");
         int n=s.nextInt();
         int i;
         for(i=0;i<n;i++)
         {
            list.addFirst(s.nextInt());
         }
         System.out.println("Enter"+ n +"element");
         for(i=0;i<n;i++)
         {
            list.addLast(s.nextInt());
         }

         System.out.println(list);


           // 2 name.get(index) method 
          /* for (i = 0; i <list.size(); i++) {
                
            System.out.print(list.get(i));
            System.out.print(", ");
            }
            System.out.println();*/

            // 2.1 name.getFirst() method 
          
                
           /* System.out.print(list.getFirst()); // does not need any index or parameter*/
            
            // 2.1 name.getLast() method 
          
                
           /* System.out.print(list.getFirst());  // does not need any index or parameter*/
            
        // size() method
            /*System.out.println("Size if the ArrayList is "+ list.size());*/
            
        // 3 name.remove(index) method

           /*list.remove(2);
           System.out.println("After removing the elemnt from 2nd index");
           System.out.println(list);*/

        // 4 name.contains(element) method --> return boolean
          /*System.out.println("element 3 present: "+ list.contains(2)); // so ArrayList is not immutable it changes
          */ 

        // 5 merging two ArrayList name.addAll(name2) --> it will take both array as a parameter
             
           /*  System.out.println("enter an ArrayList of 5 element");
             
           for (i = 0; i <5; i++) 
            {
                
                list2.add(s.nextInt());
            } 
            list.addAll(list2);
            System.out.println("ArrayList l1 after merging "+ list);
            System.out.println("2nd ArrayList"+ list2);
            System.out.println("Size if the ArrayList is "+ list.size());

            list2.addAll(list);  // try this as well
            System.out.println("ArrayList l1 after merging "+ list);
            System.out.println("2nd ArrayList"+ list2);

            System.out.println(list);
            System.out.println(list2);*/

            

        // 6 merging two ArrayList name.addAll(index, name2) --> it will take both array as a parameter and starting index for merging
                                                         
             
           /*System.out.println("enter an ArrayList of 5 element");
            for (i = 0; i <5; i++) 
            {
                
                list2.add(s.nextInt());
            }
            list.addAll(2,list2); // the remaining element after 2nd index will not be overrided but they will print after the element of 2nd array
            System.out.println("ArrayList l1 after merging "+ list);
            System.out.println("2nd ArrayList"+ list2);*/

        // 7 name.set(index, element) 
             
             /*list.set(2,9999);
             System.out.println(list);*/


    }
    
}
