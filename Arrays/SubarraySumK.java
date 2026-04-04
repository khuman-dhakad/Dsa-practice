import java.util.*;

public class SubarraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }


        sc.close();
    }
}