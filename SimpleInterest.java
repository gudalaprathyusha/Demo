import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principal amount (p): ");
        float p = scan.nextFloat();
        System.out.print("Enter time in years (t): ");
        float t = scan.nextFloat();
         System.out.print("Enter rate of interest (r): ");
        float r = scan.nextFloat();
        float si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
    }
}
