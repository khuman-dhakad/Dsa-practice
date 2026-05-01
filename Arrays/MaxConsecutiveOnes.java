import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (0 or 1): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            if (count > maxCount) {
            maxCount = count;
        }
    } else {
        count = 0;
    }
}
    }
}