import java.util.Scanner;

public class sajib1{

public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      int n;
      n = input.nextInt();
        int a1[] = new int[n];
       
       for(int i=0;i<n;i++){
           a1[i] = input.nextInt();
           }  
           
           for(int i=0;i<n;i++){
             
             System.out.println(+a1[i]);
           }
   
   }

}
