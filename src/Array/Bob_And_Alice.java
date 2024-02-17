// /*Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

// The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

// The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

// If a[i] > b[i], then Alice is awarded 1 point.
// If a[i] < b[i], then Bob is awarded 1 point.
// If a[i] = b[i], then neither person receives a point.
// Comparison points is the total points a person earned.

// Given a and b, determine their respective comparison points.

// Example

// a = [1, 2, 3]
// b = [3, 2, 1]
// For elements *0*, Bob is awarded a point because a[0] .
// For the equal elements a[1] and b[1], no points are earned.
// Finally, for elements 2, a[2] > b[2] so Alice receives a point.
// The return array is [1, 1] with Alice's score first and Bob's second.*/
// import java.util.*;

// class Bob_And_Alice
// {

//  static int[] CompareTriplet(int[] a,int[] b)
//  { int a1=0,b1=0;
//    int[] ans=new int[2];
//  	for(int i=0;i<3;i++)
//        {
//            if(a[i]>b[i])
//            {
//                a1++;
//            }
//            else if(a[i]<b[i])
//            {
//                b1++;
//            }
//            else
//            {
//                a1=a1+0;
//                b1=b1+0;
//            }
//        }
//        ans[0]=a1;
//        ans[1]=b1;
//        //System.out.println(ans[0]);
//        //System.out.println(ans[1]);
//        return ans;

       
//  }

// 	public static void main(String[] args)
// 	{
// 		Scanner s=new Scanner(System.in);

// 		int[] a=new int[3];
// 		int[] b=new int[3];


// 		for(int i=0;i<3;i++)
// 		{
// 		  a[i]=s.nextInt();

// 		}
// 		for(int j=0;j<3;j++)
// 		{
// 		  b[j]=s.nextInt();
		  
// 		}
// 		int arr[]=CompareTriplet(a,b);
// 		for(int k=0;k<2;k++)
// 		{
// 			System.out.print(arr[k]);
// 			System.out.print(" ");
// 		}


// 	}
// }