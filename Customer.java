package com.coupling;

public class Customer {
	public static void main(String[]args) {
		Examination b=new Bike();
		Examination c=new Car();
		Presentation p=new Presentation(b);
		p.gift();
		
		
	}

}
