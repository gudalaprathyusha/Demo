import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumberList {
    private ArrayList<Integer> A1;
    private ArrayList<Integer> A2;

    public ArrayList<Integer> storeEvenNumbers(int N) {
        A1 = new ArrayList<>();
        for (int i = 2; i <= N; i += 2) {
            A1.add(i);
        }
        return A1;
    }

    public ArrayList<Integer> printEvenNumbers() {
        A2 = new ArrayList<>();
        for (int number : A1) {
            int multiplied = number * 2;
            System.out.print(multiplied + " ");
            A2.add(multiplied);
        }
        System.out.println(); // Move to the next line after printing the even numbers.
        return A2;
    }

    public int retrieveEvenNumber(int N) {
        if (A1.contains(N)) {
            return N;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        EvenNumberList processor = new EvenNumberList();
        Scanner scan=new Scanner(System.in);

        // Test storeEvenNumbers method
        int n=scan.nextInt();
        ArrayList<Integer> A1 = processor.storeEvenNumbers(n);
        System.out.println("A1: " + A1);

        // Test printEvenNumbers method
        ArrayList<Integer> A2 = processor.printEvenNumbers();
        System.out.println("A2: " + A2);

        // Test retrieveEvenNumber method
        int n2=scan.nextInt();
        int result = processor.retrieveEvenNumber(n2);
        if (result != 0) {
            System.out.println(n2 + " exists in A1");
        } else {
            System.out.println(n2 + " does not exist in A1");
        }
    }
}
