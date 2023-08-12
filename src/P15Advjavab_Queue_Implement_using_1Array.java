import java.util.*;


public class P15Advjavab_Queue_Implement_using_1Array {
    public static class queue
    {static int front=0,rear=0;
        static int[] arr;
        static int size;
        queue(int n)
        {
          arr=new int[n]; 
          this.size=n;

            
        }


        public static void add(int data)    // time complexity of adding the element is O(1)
        {
            Scanner s=new Scanner(System.in);
            
            int i;
            arr[rear]=data;
            rear++;
            return;            
            
        }
        public static int remove()
        {  // front should always be zero , so the time complexity of the removal is O(n)
            if(rear>0)                               //         |
            {                                        //         |
            int x=arr[0];                            //         |
            int temp;                                //         |
            for(int i=0;i<rear;i++)                  //         V
            {                                        // due to the use of for loop in every removal
                
                 arr[i]=arr[i+1];
                
            }
            rear--;
            return x;
        }
        else
        {
            return -1;
        }


        }


    }

    public static void main(String[] args)
    {  queue q=new queue(6); //    when we are implementing the queue using array we have to pre define the size of the queue,
                             //    which is not very much logical
      Scanner s=new Scanner(System.in);
      q.add(5);
      q.add(56);
      q.add(23);
      System.out.println(q.remove());
      System.out.println(q.remove());
      System.out.println(q.remove());
      
      System.out.println(q.remove());





        }
}
