package com.vipul;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ArrayList<laptop> list=new ArrayList<>();
		
		list.add(new laptop("dell",4,5000));
		list.add(new laptop("apple",3,7000));
		list.add(new laptop("Acer",8,9000));
		
		Collections.sort(list); // step 1:- jab mai "Collection.sort" mai apni list ka object pass karta hu to pehle to ye error degi,
								//          qki ye ek interface hai to isko implement karna padega, vo bhi laptop.java class mai
		
		for(laptop l:list)
		{
			System.out.println(l);
		}
		
		

	}

}
