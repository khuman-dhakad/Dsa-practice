import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return new int[0];
    }

}

public class IntersectionOfTwoArrayII {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = solution.intersect(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }

}