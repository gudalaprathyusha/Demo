package com.tap;



	public class Account implements Bank 
	{
		public void credit()
		{
		    int a=450;
		
			System.out.println(a);
		}
		public void debit()
		{
			int b=427;
			
			System.out.println(b);
		}
		public static void main(String[]args)
		{
			Account A=new Account();
			A.debit();
			A.credit();
			A.loan();
			
		}
		@Override
		public void loan() {
			System.out.println("he took loan");
			// TODO Auto-generated method stub
			
		}
		

	}


