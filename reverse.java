import java.util.Scanner;
class reverse{
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    num = input.nextInt();
     int rev = 0;
     while(num>0){
           int temp = num%10;
           rev = rev*10+temp;
           num = num/10;
     }
     System.out.println("Rev"+rev);
     }
 }
