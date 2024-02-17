import java.util.Scanner;
import java.util.function.BiConsumer;
interface Bicycle
{    int x=6;
    public void ApplyBreak(int b);
    public void SpeedUp(int s);

//        public void clutch()   // Interface abstract methods cannot have body
//    {
//        System.out.println("apply clutch");
//    }
   
}

interface color
{
    public void color();
}


class AvonCycle implements Bicycle,color
{  int speed;
     public void setspeed(int speed)
     {
         this.speed=speed;
     }
    public void ApplyBreak(int x)
    {
      this.speed=this.speed-x;

    }
    public void SpeedUp(int y)
    {
      this.speed=this.speed+y;
      
    }
    public void color()
    {
        System.out.println("Color of AVON cycle is black");
    }

    public void getspeed()
    {
      System.out.printf("\nchanged speed is %d\n",this.speed);
    }
}

class AtlasCycle implements Bicycle,color
{  int speed;
     public void setspeed(int speed)
     {
         this.speed=speed;
     }
    public void ApplyBreak(int x)
    {
      this.speed=this.speed-x;

    }
    public void SpeedUp(int y)
    {
      this.speed=this.speed+y;
      
    }
    public void color()
    {
        System.out.println("Color of atlas cycle is blue");
    }

    public void getspeed()
    {
      System.out.printf("\nchanged speed is %d\n",this.speed);
    }
}


public class P11Ch_Interface_1 {
    public static void main(String[] args)
    { //  Bicycle b=new Bicycle();  this is not 
          Bicycle b=new AvonCycle();// we can create the reference of interfaces but not the object 

        AvonCycle mycycle=new AvonCycle();
        AtlasCycle mycycle1=new AtlasCycle();

       
        mycycle.setspeed(20);
         
        mycycle.SpeedUp(10);
        mycycle.getspeed();

        mycycle.ApplyBreak(2);
        mycycle.getspeed();

        mycycle.color();

System.out.println("----------------------");

        mycycle1.setspeed(25);
         
        mycycle1.SpeedUp(10);
        mycycle1.getspeed();

        mycycle1.ApplyBreak(2);
        mycycle1.getspeed();

        mycycle1.color();
       


    }
    
}
