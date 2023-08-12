public class Break_Continue {

    public static void main(String[] args)
    {int i,j;
        for(i=0;i<=4;i++)
        {
            System.out.printf(" %d ",i);
            if(i==2)
            {
                break;
            
            }
        }

        for(j=5;j<=10;j++)
        {
            
            if(j==8)
            continue;
            System.out.printf(" %d ",j);
            
            
        }


    }
    
}
