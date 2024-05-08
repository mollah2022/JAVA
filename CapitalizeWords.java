
package javaapplication3;
import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Capitalize the first letter of each word
        String capitalizedSentence = capitalizeWords(sentence);

        // Output the capitalized sentence
        System.out.println("Capitalized sentence: " + capitalizedSentence);

        scanner.close();
    }

    public static String capitalizeWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        StringBuilder result = new StringBuilder();

        // Capitalize the first letter of each word and append to the result
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                result.append(firstChar).append(restOfWord).append(" ");
            }
        }

        // Remove trailing whitespace and return the result
        return result.toString().trim();
    }
}


