import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        //For taking elements from user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element : " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }

        //For find pairs of to sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print(arr[i] + " " + arr[j]);
                    return;
                }
            }
        }
        System.out.println("No Pair Found!");
        sc.close();
    }
}