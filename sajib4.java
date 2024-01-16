import java.util.Scanner;

public class sajib4{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      String s1,s2;
      
      s1 = input.nextLine();
      s2 = input.nextLine();
      
      System.out.println(s1);
      
      int l = s1.length();
      
      System.out.println("Length :"+l);
      char[] ch=s1.toCharArray();
      
      for(int i=0;i<l;i++){
          System.out.println(ch[i]);
          
         }
         System.out.println("\n\n");
         
         String s3 = s1+s2;
         
         System.out.println(s3);
   }
 
}
