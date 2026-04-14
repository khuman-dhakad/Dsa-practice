import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store first element
        int first = arr[0];

        // Shift all elements left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place first element at end
        arr[n - 1] = first;

        // Output
        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}