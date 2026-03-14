import java.util.Scanner;

public class EvenCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of an Array:");
        int size = sc.nextInt();

        

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element Number " + (1 + i) + " :");
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count++;
            }

        }

        System.out.print("Even numbers count = " + count);
        sc.close();
    }
}
