package com.tap;
import java.util.Scanner;

public class PrimeCheck {
	 public static String isPrime(int n)
	  {
	    int i;
	    int count=0;
	    for(i=1;i<=n;i++)
	    {
	      if(n%i==0)
	      {
	         count++;
	      }
	    }
	    if(count==2)
	    {
	      return "prime";
	    }
	    else
	    {
	      return "Not prime";
	    }
	  }
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    String res=isPrime(n);
	    System.out.print(res);
	  }
	}


