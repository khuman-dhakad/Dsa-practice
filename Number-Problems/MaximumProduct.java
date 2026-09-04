public class MaximumProduct {

    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("At least three numbers are required");
        }

        // Keep the three largest and two smallest values; both groups can form the best product
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : nums) {
            if (number >= largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = number;
            } else if (number >= secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = number;
            } else if (number > thirdLargest) {
                thirdLargest = number;
            }

            if (number <= smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest) {
                secondSmallest = number;
            }
        }

        // Two negative values can produce a larger result than the three largest values
        return Math.max(largest * secondLargest * thirdLargest,
                largest * smallest * secondSmallest);
    }

    public static void main(String[] args) {
        MaximumProduct solver = new MaximumProduct();
        int[] test1 = {1, 2, 3, 4};
        System.out.println("Product for [1, 2, 3, 4]: " + solver.maximumProduct(test1));

        int[] test2 = {-10, -10, 1, 2, 3};
        System.out.println("Product for [-10, -10, 1, 2, 3]: " + solver.maximumProduct(test2));

        int[] test3 = {-5, -4, -3, -2};
        System.out.println("Product for [-5, -4, -3, -2]: " + solver.maximumProduct(test3));

        int[] test4 = {2, 2, 2, 5};
        System.out.println("Product for [2, 2, 2, 5]: " + solver.maximumProduct(test4));
    }
}
