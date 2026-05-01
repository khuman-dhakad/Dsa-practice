import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //input size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        //input element
        System.out.println("Enter elements (0 or 1): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
                int count = 0;
                int maxCount = 0;
                    // Single pass
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
            //output
            System.out.println("Maximum consecutive 1s = " + maxCount);
            sc.close();
    }
}