import java.util.Scanner;
class fibo{
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    num = input.nextInt();
    int a1 = 0;
    int a2 = 1;
    System.out.println(a1);
    System.out.println(a2);
    for(int i=2;i<=num;i++){
        int temp = a1+a2;
        System.out.println(temp);
           a1 = a2;
           a2 = temp;
       }
     }
 }
