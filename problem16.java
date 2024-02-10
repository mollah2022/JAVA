import java.util.Scanner;

class problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Character: ");
        char ch = (input.nextLine()).charAt(0);
        switch (ch) { 
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;

            default:
                System.out.println(ch + " is a Non-Vowel Character.");
        }
    }
}
