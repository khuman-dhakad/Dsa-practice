import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // For taking elemnt input from user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int avg = 0;

        System.out.print("Array is :");
        // For print array element and sum claculating
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }
        System.out.println("\nSum is = " + sum);
        avg = sum / arr.length;

        System.out.println("Average is = " + avg);

        sc.close();
    }
}