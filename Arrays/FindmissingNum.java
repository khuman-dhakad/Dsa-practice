import java.util.Scanner;
public class FindmissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // for taking input from user
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //For checking number 0 to n
        for (int i = 0; i <= n; i++) {
            boolean found = false;

            // For check avaiability of element
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            //  If not found then missing number is
            if (!found) {
                System.out.println("Missing number = " + i);
                break;
            }
        }
        sc.close();
    }
}