import java.util.Scanner;
public class prime_number{
 public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int num;
       num = input.nextInt(); 
       if(num <= 1){      
           System.out.println("Not Prime");         
           } 
           else{  
            int sajib = 1; 
           for(int i=2;i<num;i++){
              if(num%i==0){
                    sajib = 0;
                    break;
                 }
          } 
          if(sajib == 0){      
                System.out.println("Not Prime");         
                }
          else{
          System.out.println("Prime");
        }  
    }
 }

}
