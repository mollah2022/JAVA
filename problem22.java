import java.util.Scanner;
public class problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                alphabetCount++;
            }
            else if (Character.isDigit(ch)) {
                digitCount++;
            }
            else {
                specialCharCount++;
            }
        }
        System.out.println("Total number of alphabets: " + alphabetCount);
        System.out.println("Total number of digits: " + digitCount);
        System.out.println("Total number of special characters: " + specialCharCount);
    }
}

