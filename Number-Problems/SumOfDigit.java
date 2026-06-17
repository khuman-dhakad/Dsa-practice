import java.util.Scanner;
public class SumOfDigit{
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum+digit;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        

    }
}