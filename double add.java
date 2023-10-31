import java.util.Scanner;

public class Addition {
    
    public double add(double a, double b){
        double res1 = a + b;
        return res1;
    }

    public double add(double a, double b, double c){
        double res2 = a + b + c;
        return res2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        Addition a1 = new Addition();
        
        double res1 = a1.add(a, b);
        System.out.println("Addition of two values is " + res1);
        
        double res2 = a1.add(a, b, c);
        System.out.println("Addition of three values is " + res2);
    }
}
