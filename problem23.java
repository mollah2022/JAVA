import java.util.Scanner;
public class problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the substring to check: ");
        String substring = scanner.nextLine();
        boolean isSubstringPresent = inputString.contains(substring);
        if (isSubstringPresent) {
            System.out.println("The substring '" + substring + "' is present in the input string.");
        } else {
            System.out.println("The substring '" + substring + "' is not present in the input string.");
        }
    }
}

