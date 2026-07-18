import java.util.Scanner;

public class VowelCounter {
    public static int countVowels(String text) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        System.out.println("Input received: " + userInput);
        scanner.close();
    }
}
