interface Camera
{
public void captur();
/*public void show()
    {                                          // it throws an error in java so we have to add "default" instead of "public".
        System.out.println("in interface A");
    }*/

default void opening()                       // Default is the correct way of implementing method in Interface
{
    System.out.println("Camera is opening....");
}
}

interface wifi
{
    public String[] getnetwork();
    static void info(){
        System.out.println("this is 12 band 5g phone");
    }

}

interface mediaplayer
{
    public void media();
    public default  void baja()
    {
        System.out.println("songs bajjj rahe hai");
    }


}

class cellphone
{
  public void calling()
      {
        System.out.println("calling.....");
      }

}
class smartphon extends cellphone implements Camera,wifi,mediaplayer
{
  public void captur()
  {
    System.out.println("capturing photo.....");
  } 
  public void media()
  {
      System.out.println("playing... music");
  } 
  public String[] getnetwork()
  {
      String[] networklist={"airtel","vodafone","idea","JIO"};
      return networklist;

  }

}

public class P11Ch_Default_Methods {
    public static void main(String[] args)
    {
       smartphon MI=new smartphon();
       

       String[] str=MI.getnetwork();
        wifi.info();  // we can call the static method of interface without any object creation
      int n=str.length;
      for(int i=0;i<n;i++)
      {
          System.out.println(str[i]);
      }
     
      MI.calling();
      MI.captur();
      MI.media();
      MI.baja();
      cellphone nokia=new smartphon();

      nokia.calling();
      


    }
    
}
