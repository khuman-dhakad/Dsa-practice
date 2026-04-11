import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxReach = 0;

        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                System.out.println(false);
                sc.close();
                return;
            }

            if (i + arr[i] > maxReach) {
                maxReach = i + arr[i];
            }
        }
        sc.close();
    }
}