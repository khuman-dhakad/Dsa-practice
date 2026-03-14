import java.util.Scanner;

public class MaxNum0fArray {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the Size An Array:");
       int size=sc.nextInt();

       int [] arr = new int [size];
       
       for(int i=0;i<arr.length;i++){
           System.out.print("Enter Num of Elements " + (1+i) + ":" );
           arr[i]=sc.nextInt();
        }
        
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
           max= arr[i];
        }
       }
        System.out.print("Max Elements Is:"+max);

sc.close();
    }
}