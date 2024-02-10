import java.util.Scanner;
class problem5{
   public static void main(String[] args){
          Scanner input = new Scanner(System.in);
      int num;
      num = input.nextInt();
      int sum=0;
     while(num>0){
           int temp = num%10;
            sum = sum*10+temp;
           num = num/10;
       }
       System.out.println("REVERSE : "+sum);
   }
 }
