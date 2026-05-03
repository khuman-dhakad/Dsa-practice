import java.util.Arrays;

public class TwoSumII{

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                return result;
            } 
            else if (sum < target) {
                start++;
            } 
            else {
                end--;
            }
        }

        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(numbers, target);

        System.out.println("Result: " + Arrays.toString(ans));
    }
}