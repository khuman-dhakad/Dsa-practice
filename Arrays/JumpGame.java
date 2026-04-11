import java.util.Scanner;

public class JumpGame {
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

        int maxReach = 0;

        for (int i = 0; i < n; i++) {
            // If current index is not reachable
            if (i > maxReach) {
                System.out.println(false);
                sc.close();
                return;
            }

            // Update max reach
            if (i + arr[i] > maxReach) {
                maxReach = i + arr[i];
            }
        }

        // If loop completes then last index reachable
        System.out.println(true);

        sc.close();
    }
}