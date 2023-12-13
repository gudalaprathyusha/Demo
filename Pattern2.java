import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, k, n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= n-i+1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
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
