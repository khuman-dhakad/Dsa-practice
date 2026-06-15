import java.util.Scanner;
public class CountDigit{
public static int countDigit(int num){
    int count = 0;
    while(num != 0){
        num/=10;
        count++;
    }
    return count;
}
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter num : ");
      int num = sc.nextInt();
    }
}