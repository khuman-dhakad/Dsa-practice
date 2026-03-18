import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of an Array:");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Enter Valid Size!");
            sc.close();
            return;
        }
        int[] arr = new int[size];

        int sum = 0;
        //For taking input of elements and calculte sume of elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element Number " + (i + 1) + " :");
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
         //For print array elements
        System.out.print("Element Of Array Is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum of array = " + sum);
        sc.close();
    }
}