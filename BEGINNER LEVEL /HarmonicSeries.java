import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;   // adding term 1/i
        }

        System.out.println("Sum of the series 1 + 1/2 + 1/3 + ... + 1/" + n + " = " + sum);
    }
}
