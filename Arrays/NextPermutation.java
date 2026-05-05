import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

                int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
                int i = n - 2;

        while(i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
                if(i >= 0) {
            int j = n - 1;

            while(arr[j] <= arr[i]) {
                j--;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
                int start = i + 1;
        int end = n - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Next Permutation:");
        for(int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}