import java.util.Scanner;
class vowelcon{
public static void main(String[] args){
      Scanner input = new Scanner(System.in);
       char ch;
       ch = input.next().charAt(0);
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O'||ch=='U'){
              System.out.println("VOWEL");
            }
        else{
             System.out.println("CON");
           }
     }
  }
