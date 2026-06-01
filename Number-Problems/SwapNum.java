import java.util.Scanner;
public class SwapNum{
    public static void swapNumMethod1(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After reversed = "+a + " "+b);
    }
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num : ");
        int a = sc.nextInt();
        System.out.print("Enter second num : ");
        int b = sc.nextInt();

        swapNumMethod1(a,b);
    }
}