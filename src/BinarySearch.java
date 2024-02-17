public class BinarySearch
{
    public static void main(String[] args) {
        int a[]={3,12,24,43,54,56,76,89};
        int n=56;
        int ub=a.length-1;
        int lb=0;

        int mid=(ub+lb)/2;

        if(n==a[mid])
        {
            System.out.println("item is present at "+ mid+" position");
        }
        else if (n>a[mid]) {

            for(int i=mid;i<=ub;i++)
            {
                if(a[i]==n)
                {
                    System.out.println("item is present at "+i+" position");
                    break;
                }
            }

        }

        else
        {
            for(int i=0;i<=mid;i++)
            {
                if(a[i]==n)
                {
                    System.out.println("item is present at "+i+" position");
                    break;
                }
            }
        }
    }
}
