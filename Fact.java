package com.tap;
import java.util.Scanner;

public class Fact {
	

	    public static void main(String[]args){
	        Scanner scan=new Scanner(System.in);
	        int n =scan.nextInt();
	        int i,fact=1;
	        
	        for(i=1;i<=n;i++)
	        {
	            fact=fact*i;
	        }
	        System.out.println(fact);
	    }
	}


