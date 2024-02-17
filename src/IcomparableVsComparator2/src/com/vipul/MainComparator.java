//package com.vipul;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class MainComparator {
//
//	public static void main(String[] args)
//	{
//
//		ArrayList<laptop> list=new ArrayList<>();
//
//		list.add(new laptop("dell",4,5000));
//		list.add(new laptop("apple",3,7000));
//		list.add(new laptop("Acer",8,9000));
//
//		Comparator<laptop> comp=new Comparator<laptop>()
//				{
//
//			public int compare(laptop l1,laptop l2) {
//				// TODO Auto-generated method stub
//
//				if(l1.getBrand().compareTo(l2.getBrand())<1)
//				return 1;
//				else
//					return -1;
//			}
//				};
//
//		Collections.sort(list,comp);; /* step 1:- for comparable:-(jab mai "Collection.sort" mai apni list ka object pass karta hu
//		                                                  to pehle to ye error degi, qki ye ek interface hai to isko implement
//								                          karna padega, vo bhi laptop.java class )
//
//								            FOR COMPARATOR:-(isme hame koi bhi interface implement karne ki jarrurat nahi hai qki
//								                           iski already implement class java mai present hai hame iska logic isi
//								                           class mai dena hota )  */
//
//		for(laptop l:list)
//		{
//			System.out.println(l);
//		}
//
//	}
//}
