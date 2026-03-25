import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicate = -1;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = arr[i];
                    break;
                }
            }
            if(duplicate != -1) {
                break;
            }
        }
            sc.close();
    }
}