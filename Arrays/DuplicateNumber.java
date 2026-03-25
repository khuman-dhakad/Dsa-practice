import java.util.Scanner;
public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        // For taking array elements input from user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int duplicate = -1;
        // For find duplicate number
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    break;
                }
            }
            if (duplicate != -1) {
                break;
            }
        }
        // For print duplicate number
        if (duplicate != -1) {
            System.out.println("Duplicate number is: " + duplicate);
        } else {
            System.out.println("No duplicate found");
        }
        sc.close();
    }
}