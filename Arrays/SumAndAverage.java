import java.util.Scanner;
public class SumAndAverage{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        int []arr = new int [size];

        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        int avg = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum is = "+sum);
        avg = sum/arr.length;

         System.out.println("Average is = "+avg);


        sc.close();
    }
}