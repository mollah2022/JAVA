import java.util.Scanner;

public class sajib{

public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      int n;
      n = input.nextInt();
      for(int i=1;i<=n;i++){
         if(i%2==0){
             System.out.println("EVEN :"+i);
             }
             
             else{
              System.out.println("ODD :"+i);
              }
              
          }    
   
   }

}
