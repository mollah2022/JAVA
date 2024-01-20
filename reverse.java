import java.util.Scanner;

public class reverse{

public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       
       int num;
       num = input.nextInt();
        int temp = 0,result=0;
       
       while(num>0){
       
             temp = num%10;
             result =result*10+temp;
             num = num/10;         
       }
       
       System.out.println("REVERSE :"+result);

  }

}
