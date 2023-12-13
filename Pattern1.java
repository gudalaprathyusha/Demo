import java.util.Scanner;
public class Pattern1 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int j;
		int k;
		int n=5;
		for(i=1;i<=n;i++) {
			for(k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*"+ " " );
			}
			System.out.println();
		}
	}

}
