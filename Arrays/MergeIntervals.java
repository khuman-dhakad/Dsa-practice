import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter intervals:");

        for(int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
                for(int i = 1; i < n; i++) {

            if(intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                result.add(current);
                current = intervals[i];
            }
        }

        result.add(current);
                System.out.println("Merged Intervals:");

        for(int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}