import java.io.*;
import java.util.Scanner;
 
class problem11 {
    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
        String s1=input.nextLine();
        String s2="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println(s1); 
       
      for (int i=0; i<s1.length(); i++)
      {
        ch= s1.charAt(i); 
        s2= ch+s2;
      }
      System.out.println("Reversed word: "+ s2);
    }
}
