public class P15Advjavab_QueueCircular_Implement_using_1Array  {
public static class queuecircular{
     static int arr[];
    static int  front=0;
    static int  rear=0;
    static int size;
    queuecircular(int n)
    {
        this.size=n;
        arr=new int[n];
    }

    public static boolean isempty()
    {
        return rear==front;
    }

    public static void add(int n)
    {
      if(rear+1==front)
      {
          System.out.println("queue is full");
          return;
      }

      arr[rear]=n;
      rear=(rear+1)%(size);
    }

    public static int remove()
    {
        
        
        int x;
        x=arr[front];
        front=(front+1)%size;
        return x;


    }

}

public static void main(String[] args)
{
    queuecircular cq=new queuecircular(5);


    cq.add(1);
    cq.add(2);
    cq.add(3);
    System.out.println(cq.remove());
    System.out.println(cq.remove());
    cq.add(4);
    cq.add(5);
    cq.add(6);
    
    
    
    
    System.out.println(cq.remove());
    System.out.println(cq.remove());
    System.out.println(cq.remove());
    System.out.println(cq.remove());
    

    
    


}
    
}
