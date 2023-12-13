import java.util.Scanner;

public class Lcm {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=scan.nextInt();
		System.out.println("enter b value:");
		int b=scan.nextInt();
		int gcd=1;
		int i;
		for(i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
				}
			}
		 int lcm=(a*b)/gcd;
		 System.out.println("lcm of two numbers a and b is:"+lcm);
		
	}

}
