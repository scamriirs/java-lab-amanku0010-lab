import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Euclid's Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF = " + a);
        sc.close();
    }
}
