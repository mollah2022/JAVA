import java.util.Scanner;
class prime{
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    num = input.nextInt();
    int ria = 0;
    if(num>=2){
         
         for(int i=2;i<num;i++){
              if(num%i==0){
                   ria = 1;
                   break;
                }
          }
          if(ria==0){
            System.out.println("Prime");
          }
          else{
          System.out.println("not Prime");
}
    }
    else{
     System.out.println("not Prime");
  }
 }
 }
