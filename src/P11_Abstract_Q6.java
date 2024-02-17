interface tvremote
{
 public void remotefunction();
                 
}
interface smarttvremote
{
 public void smartremotefunction();

}

class smarttv implements tvremote,smarttvremote
{
    public void remotefunction()
    {
     System.out.println("this is a simple tv remote  ");
    }
    public void smartremotefunction()
    {
     System.out.println("this is smart tv remote  ");
    }
}

public class P11_Abstract_Q6 {
    public static void main(String[] args)
    {
        smarttv s=new smarttv();
        s.remotefunction();
        s.smartremotefunction();
    }
    
}
