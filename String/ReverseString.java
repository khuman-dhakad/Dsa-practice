import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();
        
        String reversed = "";
        
        // Loop backward from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversed);
        
        // Close the scanner resource
        scanner.close();
    }
}
