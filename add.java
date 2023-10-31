import java.util.Scanner;

public class Addition {
    
    public int add(int a, int b){
        int res1 = a + b;
        return res1;
    }

    public int add(int a, int b, int c){
        int res2 = a + b + c;
        return res2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        Addition a1 = new Addition();
        
        int res1 = a1.add(a, b);
        System.out.println("Addition of two values is " + res1);
        
        int res2 = a1.add(a, b, c);
        System.out.println("Addition of three values is " + res2);
    }
}
