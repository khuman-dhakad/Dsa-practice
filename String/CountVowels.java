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
        int count = 0;
        String lowerStr = str.toLowerCase();
        
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
