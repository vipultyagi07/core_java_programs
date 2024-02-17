package Sorting;

public class D_QuickSort {
    public static void main(String[] args) {
        int a[] = {6,3,9,5,2,8};
        int l=0;
        int h=a.length-1;

        quick_sort(a,l,h);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }

    }

    private static void quick_sort(int[] a, int l, int h) {

        if(l<h)
        {
            int pivot_idx=partitions(a,l,h);

            quick_sort(a,l,pivot_idx-1);
            quick_sort(a,pivot_idx+1,h);

        }
    }

    private static int partitions(int[] a, int l, int h) {
        int pivot=a[h];

        int i=l-1; // it is used to track that how much space should be empty in our array from start, so that element
                   // smaller than our pivot can take the place

                    //           or

                    //  ye "i" khali jagah track kar raha hai jaha par hamare pivot element se chote element aa sakte

        for(int j=l;j<h;j++)
        {
            if(a[j]<pivot)
            {    i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }

          i++;
        int temp=a[i];
        a[i]=a[h];
        a[h]=temp;
        return i;

        // ab hm naye pivot ke liye jagah bana rahe hai


    }
}
