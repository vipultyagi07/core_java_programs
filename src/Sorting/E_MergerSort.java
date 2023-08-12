package Sorting;

public class E_MergerSort {


    private static void merge_sort(int[] a, int l, int r) {
        if(l>=r)
        {return;}
        else
        { int m=(l+r)/2;


            merge_sort(a,l,m);

            merge_sort(a,m+1,r);
          //  System.out.println(l+" "+m+" "+r);
            merge_(a,l,m,r);

        }
    }


    private static void merge_(int[] a, int l, int m, int r) {

        int b[] =new int [10];
        int i=l,j=m+1,k=l;
        //int n1=m-l+1;
        //System.out.println(l+" "+m+" "+r);




        while(i<=m&&j<=r)
        {
            if(a[i]>a[j])
            {
                b[k]=a[j++];
            }
            else
            {
                b[k]=a[i++];
            }

            k++;

        }

        if(i>m)
        {
            while(j<=r)
            {
                b[k++]=a[j++];
            }
        }

        else
        {
            while(i<=m)
            {
                b[k++]=a[i++];
            }
        }

        for(k=l;k<=r;k++)
        {
            a[k]=b[k];
        }


        System.out.println();


    }


    public static void main(String[] args) {

        int a[]={6,99,1,5,2,4};

          int r=a.length-1;
          int l=0;

        merge_sort(a,l,r);
        for(int k=0;k<=r;k++)
        {
            System.out.print(" "+a[k]);
        }


    }


}
