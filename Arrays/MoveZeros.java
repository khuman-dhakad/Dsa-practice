import java.util.Scanner;
public class MoveZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        // For taking array elements from user
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        // For zeros movements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        // For filling remaining zeros
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println("Array after moving zeros:");
        // For print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}