import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        VowelCounter counter = new VowelCounter();
        int result = counter.countVowels(input);
        
        System.out.println("Number of vowels: " + result);
        scanner.close();
    }
}

class VowelCounter {
    public int countVowels(String str) {
        return 0; // Stub implementation
    }
}
