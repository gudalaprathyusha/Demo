package com.tap;

public class Customer implements Bike,Car{

	@Override
	public void carCompany() {
		// TODO Auto-generated method stub
		System.out.println("car company is jeep");
		
	}
     @Override
	public void bikeCompany() {
		// TODO Auto-generated method stub
		System.out.println("bike company is Fz");
		
	}
	


public static void main(String[]args) {
	Customer c=new Customer();
	c.carCompany();
	c.bikeCompany();
}
	
}
