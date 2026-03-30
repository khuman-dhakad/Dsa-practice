import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        // For taking array input from user
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // For Main logic (Kadane’s Algorithm)
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (currentSum + arr[i] > arr[i]) {
                currentSum = currentSum + arr[i];
            } else {
                currentSum = arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println("Maximum Subarray Sum Is: " + maxSum);
        sc.close();
    }
}