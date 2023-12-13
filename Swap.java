import java.util.Scanner;
public class Swap {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println("after swapping");
		a+=b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	

}
