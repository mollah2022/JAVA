import java.util.Scanner;
class loop{
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    num = input.nextInt();
    for(int i=0;i<=num;i++){
           if(i%2==0){
              System.out.println("even"+i);
           }
           else {
              System.out.println("odd"+i);
           }
       }
     }
 }
