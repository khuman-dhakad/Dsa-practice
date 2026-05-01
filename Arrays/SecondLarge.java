import java.util.Scanner;

public class SecondLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Enter Valid Size(At Least 2 Or More)");
            sc.close();
            return;
        }

        int[] arr = new int[size];
        //Loop for taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element Number " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

                //Loop for finding second large element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];

            } else if (secondLarge < arr[i] && arr[i] != large) {
                secondLarge = arr[i];
            }
            
        }
        if(secondLarge==Integer.MIN_VALUE){
            System.out.println("Second Large Number Not Avaiable!");
        }
        else{
            System.out.print("Second Largest Number = " + secondLarge);
        }
        sc.close();
    }
}