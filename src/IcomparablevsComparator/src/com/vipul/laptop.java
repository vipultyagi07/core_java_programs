package com.vipul;

public class laptop implements Comparable<laptop>  //Step: 2 yaha par hm apni khud ki sorting technique laga sakte hai
{ 
	private String brand;
	private int ram;
	private int price;
	
	public String getBrand() {
	    return brand;
	}
	public int getRam() {
	    return ram;
	}

	public int getPrice() {
	    return price;
	}
	public void setBrand(String brand) {
	    this.brand = brand;
	}
	public void setRam(int ram) {
	    this.ram = ram;
	}
	public void setPrice(int price) {
	    this.price = price;
	}

	@Override
	public String toString() {
	    return "laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	public laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	@Override
	public int compareTo(laptop list2) {
		// TODO Auto-generated method stub
		
		if(this.getRam()-list2.getRam()<0)
		return 1;
		else
			return -1;
	}
	
	

	
	
	
	
}
