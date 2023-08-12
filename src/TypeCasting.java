public class TypeCasting {

public static void main(String[] args)
{
    int i=5;
    float f=2.2f;
    String str="12300";

    // converting  float INTO int
       //TYPECASTING

     int a=(int)f;
     System.out.printf("converted from float to int =%d\n",a);
 
    // converting int into float
       // widening conversion
        float b=i;
        System.out.printf("converted from int to float =%.2f\n",b);
    
    // converting string into int

        int c=Integer.valueOf(str);//  They both can work similarly, but I think it is best because the same format we can use in "int" to "String"
     //int c=Integer.parseInt(str); // So if the string conatin alphabet or other than int value then it will give an error 
        System.out.println(c);

    // converting "int/char/float" into "String" 
        String d=String.valueOf(i);
        System.out.println(d);
        String d1=String.valueOf(f);
        System.out.println(d1);






}
    
}
      