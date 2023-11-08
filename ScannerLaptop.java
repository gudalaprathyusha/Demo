package com.tap;
import java.util.Scanner;

public class ScannerLaptop {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int option;

	        do {
	            displayOptions();
	            option = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (option) {
	                case 1:
	                    System.out.println("Enter two numbers to be added:");
	                    double num1 = scanner.nextDouble();
	                    double num2 = scanner.nextDouble();
	                    double result = num1 + num2;
	                    System.out.println("The result is " + result);
	                    break;
	                case 2:
	                    System.out.println("Enter two numbers to be subtracted:");
	                    num1 = scanner.nextDouble();
	                    num2 = scanner.nextDouble();
	                    result = num1 - num2;
	                    System.out.println("The result is " + result);
	                    break;
	                case 3:
	                    System.out.println("Enter two numbers to be multiplied:");
	                    num1 = scanner.nextDouble();
	                    num2 = scanner.nextDouble();
	                    result = num1 * num2;
	                    System.out.println("The result is " + result);
	                    break;
	                case 4:
	                    System.out.println("Enter a number to check if it's even or odd:");
	                    int number = scanner.nextInt();
	                    if (number % 2 == 0) {
	                        System.out.println(number + " is even.");
	                    } else {
	                        System.out.println(number + " is odd.");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Quitting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please select an option from 1 to 5.");
	                    break;
	            }
	        } while (option != 5);
	        
	        scanner.close();
	    }

	    private static void displayOptions() {
	        System.out.println("Enter Option:");
	        System.out.println("1 - Add");
	        System.out.println("2 - Subtract");
	        System.out.println("3 - Multiply");
	        System.out.println("4 - Even/Odd Number");
	        System.out.println("5 - Quit");
	        System.out.print("Select an option: ");
	    }
	}




