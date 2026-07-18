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
        
        // Connected the method here
        System.out.println("Number of vowels: " + countVowels(userInput));
        scanner.close();
    }
}
