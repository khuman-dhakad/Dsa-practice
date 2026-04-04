import java.util.*;

public class SubarraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // HashMap to store prefix sum frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // check if (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // store prefixSum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        // Output
        System.out.println("Total subarrays: " + count);

        sc.close();
    }
}