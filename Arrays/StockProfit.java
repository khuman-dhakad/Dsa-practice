import java.util.Scanner;
public class StockProfit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
         //For taking stock price input from user
        System.out.println("Enter your stock prices:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int minPrice = arr[0];
        int maxProfit = 0;
         //For Main logic
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minPrice) {
                minPrice = arr[i]; 
            } else {
                int profit = arr[i] - minPrice;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        System.out.println("Maximum Profit Is: " + maxProfit);
        sc.close();
    }
}