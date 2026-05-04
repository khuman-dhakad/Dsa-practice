import java.util.*;

public class RearrangeAlternate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Separate positives and negatives
        int[] pos = new int[n];
        int[] neg = new int[n];

        int p = 0, ne = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0) {
                pos[p++] = arr[i];
            } else {
                neg[ne++] = arr[i];
            }
        }

        // Merge alternately
        int i = 0, j = 0, k = 0;

        // start with positive (as per question)
        while(i < p && j < ne) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }

        // remaining elements (if any)
        while(i < p) {
            arr[k++] = pos[i++];
        }

        while(j < ne) {
            arr[k++] = neg[j++];
        }

        // Output
        System.out.println("Rearranged Array:");
        for(int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}