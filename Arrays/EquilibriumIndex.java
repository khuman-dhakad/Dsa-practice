import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;
        for(int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        int index = -1;

        for(int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum) {
                index = i;
                break;
            }

            leftSum += arr[i];
        }
        System.out.println(index);
    }
}