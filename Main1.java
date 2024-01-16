import java.util.Scanner;
public class Main1{
public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        if(number%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        
    }



}
