import java.util.Scanner;
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // For taking size input from user
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // For taking array elements input from user
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // For sorting array (important for duplicate logic)
        Arrays.sort(arr);

        int duplicate = -1;

        // For finding duplicate number
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                duplicate = arr[i];
                break; // stop after first duplicate found
            }
        }

        // For printing duplicate number
        if (duplicate != -1) {
            System.out.println("Duplicate number is: " + duplicate);
        } else {
            System.out.println("No duplicate found");
        }

        sc.close(); 
    }
}