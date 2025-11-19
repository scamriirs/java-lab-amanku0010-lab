import java.util.Arrays;
import java.util.Scanner;

public class SortArrayAscending {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Sorting in ascending order

        System.out.println("Sorted list in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
