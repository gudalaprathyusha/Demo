package com.tap;
import java.util.Scanner;

public class Palindrome {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        int n = scan.nextInt(); 

	        if (isPalindrome(n)) {
	            System.out.println(n + " is a palindrome.");
	        } else {
	            System.out.println(n + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(int number) {
	        String n = String.valueOf(number);
	        int length = n.length();

	        for (int i = 0; i < length / 2; i++) {
	            if (n.charAt(i) != n.charAt(length - 1 - i)) {
	                return false;
	            }
	        }

	        return true;
	    }
	}


