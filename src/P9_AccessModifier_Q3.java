import java.util.Scanner;
class Cylinder1{
    private float r,h;
    
    Cylinder1(Float a, float b)
    {
        r=a;
        h=b;
    }
    public float getr()
    {
        return r;
    }
    public float geth()
    {
        return h;
    }
}

public class P9_AccessModifier_Q3 {
    
        public static void main(String[] args)
       {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the radius of cylinder");
        float a=s.nextFloat();
        System.out.println("Enter the height of cylinder");
        float b=s.nextFloat();
        Cylinder1 c1=new Cylinder1(a,b);
        
        float area;
        area=3.14f*c1.getr()*c1.getr()*c1.geth();                 // yaar ulta ho gya hahah:)
        System.out.printf("\n volume of cylinder is %.2f",area);
        float volume=2*3.14f*c1.getr()*c1.geth();
        System.out.printf("\n area of cylinder is %.2f",volume);
    }
    
}



