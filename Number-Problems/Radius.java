import java.util.Scanner;

public class Radius {
    public static float findCircumference(float r) {
        float rad = 2 * (3.14f * r); 
        return rad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius value: ");
        
        float r = sc.nextFloat(); 
        
        float res = findCircumference(r);
        System.out.print("Circumference = " + res);
        
        sc.close();
    }
}
