import java.util.Arrays;
import java.util.Scanner;

public class FindK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        System.out.println("Sorted Array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}