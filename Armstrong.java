package com.tap;
import java.util.Scanner;

public class Armstrong {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int originalNumber,rem,res=0;
		originalNumber=n;
		while(originalNumber!=0)
		{
			rem=originalNumber%10;
			res+=Math.pow(rem,3);
			originalNumber/=10;
			
			
		}
		if(res==n)
		{
			System.out.println(n+"is an armstrong number");
			
		}
		else {
			System.out.println(n+"is not an armstrong number");
		}
		
	}

}
