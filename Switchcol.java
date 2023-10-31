package com.tap;
import java.util.Scanner;

public class Switchcol {
	
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number (1-4): ");
	        int number = scanner.nextInt();

	        switch (number) {
	            case 1:
	                System.out.println("Red");
	                break;
	            case 2:
	                System.out.println("Orange");
	                break;
	            case 3:
	                System.out.println("Green");
	                break;
	            case 4:
	                System.out.println("Yellow");
	                break;
	            default:
	                System.out.println("Unknown color");
	        }
	    }
	}



