import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors {

    public static void main(String[] args)

    { 
        Scanner s=new Scanner(System.in);
        int p=0;
        while(p!=5)
     {Random rand=new Random();
        int r=rand.nextInt(3);
        
        
        
         System.out.println("enter \n0 for ROCK\n1 for PAPER\n2 for SCISSORS");
         int n=s.nextInt();

        
        
            switch(n)
           {
            case 0:
            { if(r==0)
             {   System.out.println("Stone XX Stone");
                 System.out.println("Draw");
             
             }
             else if(r==1)
             {   System.out.println("Stone XX Paper");
                 System.out.println("AI is the winner");
             
             }
            else if(r==2)
             {   System.out.println("Stone XX Scissor");
                 System.out.println("You are the winner");
             
             }

                break;
            }

            case 1:
            { if(r==0)
             {   System.out.println("Paper XX Stone");
                 System.out.println("You are the winner");
             
             }
             else if(r==1)
             {   System.out.println("Paper XX Paper");
                 System.out.println("Draw");
             
             }
             else if(r==2)
             {   System.out.println("Paper XX Scissor");
                 System.out.println("AI is the winner");
             
             }

                break;
            }

            case 2:
            { if(r==0)
             {   System.out.println("Scissor XX Stone");
                 System.out.println("AI is the winner");
             
             }
             else if(r==1)
             {   System.out.println("Scissor XX Paper");
                 System.out.println("You are the winner");
             
             }
             else if(r==2)
             {   System.out.println("Scissor XX Scissor");
                 System.out.println("Draw");
             
             }

                break;
            }
            

           

        }

        p++;




    }

}

    
}
