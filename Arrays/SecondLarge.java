import java.util.Scanner;

public class SecondLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Enter Valid Size(At Least 2 Or More)");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element Number " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (secondLarge < arr[i] && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        System.out.print("Second Large Number = " + secondLarge);
        sc.close();
    }
}