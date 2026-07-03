import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid value of k");
            sc.close();
            return;
        }

        Arrays.sort(nums);

        System.out.println("The " + k + "th largest element is: " + nums[n - k]);

        sc.close();
    }
}