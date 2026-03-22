import java.util.Scanner;

public class OddCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

       

        int[] arr = new int[size];

        //For taking Input from user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // For counting Odd numbers
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("Odd numbers count = " + count);

        sc.close();
    }
}