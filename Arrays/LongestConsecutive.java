import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int longest = 0;

        // Traverse using basic loop
        for (int i = 0; i < n; i++) {
            int num = arr[i];

            // Check start of sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                // Count sequence
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                if (count > longest) {
                    longest = count;
                }
            }
        }

        // Output
        System.out.println("Longest consecutive length: " + longest);

        sc.close();
    }
}