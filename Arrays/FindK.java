import java.util.Scanner;

public class FindK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user how many elements they want to enter
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array cannot be empty.");
            sc.close();
            return;
        }

        // Create an array of the given size
        int[] arr = new int[n];


        // Store each element in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        // Compare the remaining elements with the current largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Print the final answer
        System.out.println("Largest element is: " + largest);

        sc.close();
    }
}