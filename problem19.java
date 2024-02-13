
import java.util.Scanner;
class problem19 {
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Fibonacci(N);
    }
}
