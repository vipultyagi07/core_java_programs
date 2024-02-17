package Sorting;

public class A_BubbleSort {
    public static void main(String[] args) {
        int a[] ={6,99,1,5,2,4};
        int temp;


        for(int round=1;round<a.length;round++)
        {
            for(int j=0;j<a.length-round;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
