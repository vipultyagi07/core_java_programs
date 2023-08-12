package Sorting;

public class C_InsertionSort {

    public static void main(String[] args) {
        int a[] ={6,99,1,5,2,4};
        int temp;
        int j=0;


        for(int i=1;i<a.length;i++)
        {      j=i-1;
            int curr=a[i];
            while(j>=0&&curr<a[j])
            {
                a[j+1]=a[j];
                j--;
            }

            a[j+1]=curr;

        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
