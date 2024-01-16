import java.util.Scanner;

public class sajib2{
   
     public static void main(String[] args){
     
         Scanner input = new Scanner(System.in);
         int n;
         n = input.nextInt();
         
         int a1[] = new int[n];
         
         for(int i=0;i<n;i++){
               a1[i] = input.nextInt();
            }
         
         for(int i=0;i<n;i++){
            if(a1[i]%2==0){
              System.out.println("EVEN :"+a1[i]);
              }
              else{
              System.out.println("ODD :"+a1[i]);         
            }
         }
     }
   
}
