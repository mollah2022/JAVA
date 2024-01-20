import java.util.Scanner;
public class area{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double num;
      num = input.nextDouble();
      double pi = 3.141592653;
      double area = pi*(num*num);
      System.out.println("AREA :"+area);
   }
}
