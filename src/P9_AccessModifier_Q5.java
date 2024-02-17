import java.util.Scanner;
class Sphere{
    private float r;
    
    public void set(float a)
    {
      r=a;
    

    }
    public float getr()
    {
        return r;
    }
    

public class P9_AccessModifier_Q5 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Sphere c1=new Sphere();
        System.out.println("Enter the radius of Sphere");
        float a=s.nextFloat();
        //System.out.println("Enter the height of cylinder");
        //float b=s.nextFloat();
        c1.set(a);
        float area;
        area=4*3.14f*c1.getr()*c1.getr()/3;               
        System.out.printf("\n area of Sphere is %.2f",area);
        float volume=4*3.14f*c1.getr()*c1.getr()*c1.getr();
        System.out.printf("\n volume of Sphere is %.2f",volume);
    }
    
}
}