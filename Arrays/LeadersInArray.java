import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Leaders:");

        int max = arr[n - 1];
        System.out.print(max + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }

        sc.close();
    }
}