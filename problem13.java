import java.util.Scanner;
class problem13{
   public static void main(String[] args){
           Scanner input = new Scanner(System.in);
           int num1;
           num1 = input.nextInt();
           int num2 = num1;
           int rev = 0;
           while(num1>0){
               int temp = num1%10;
               rev = rev*10+temp;
               num1 = num1/10;
           }
           System.out.println(rev);
         if(rev == num2){
                  System.out.println("palindrome");
                  }
           else{
                 System.out.println("Not palindrome");
          }
     }
 }
