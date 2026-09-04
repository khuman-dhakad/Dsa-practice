public class MaximumProduct {

    public int maximumProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

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
        }

        return largest * secondLargest * thirdLargest;
    }

    public static void main(String[] args) {
        MaximumProduct solver = new MaximumProduct();
        int[] test1 = {1, 2, 3, 4};
        System.out.println(solver.maximumProduct(test1));
    }
}
