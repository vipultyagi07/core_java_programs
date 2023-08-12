package Sorting;

public class B_SelectionSort {

    public static void main(String[] args) {
        int a[] ={6,99,1,5,2,4};
        int temp;


        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
