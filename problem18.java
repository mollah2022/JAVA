import java.util.Scanner;
class problem18{
   public static void main(String[] args){
           Scanner input = new Scanner(System.in);
           int num1;
           num1 = input.nextInt();
           int fact = 1;
           for(int i=num1;i>0;i--){
                fact*=i;
          }
          System.out.println("FACTORIAL : "+fact);
     }
 }
