import java.util.Scanner;
public class SumOfArray{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the Size of an Array:");
       int size = sc.nextInt();

       int []arr= new int [size];

       for(int i=0;i<arr.length;i++){
        System.out.print("Enter Element Number "+(i+1)+" :");
        arr[i]= sc.nextInt();
       }

       int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    System.out.println("The Sum of the Array ="+sum);
    sc.close();
    }
}