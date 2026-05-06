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
    }
}