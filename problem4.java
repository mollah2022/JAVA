import java.util.Scanner;
class problem4{
   public static void main(String[] args){
          Scanner input = new Scanner(System.in);
      int num;
      num = input.nextInt();
      int sum=0;
     while(num>0){
           int temp = num%10;
            sum = sum+temp;
           num = num/10;
       }
       System.out.println("RESULT : "+sum);
   }
 }
