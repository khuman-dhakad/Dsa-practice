import java.util.Scanner;
public class SumAndAverage{
    public static void main(Static[]args){
        Scannner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        int []arr = new int [size];

        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        int average = 0;
        

        sc.close();
    }
}