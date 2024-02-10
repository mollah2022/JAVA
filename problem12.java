import java.util.Scanner;
class problem12{
   public static void main(String[] args){
         int sum = 0;
          for(int i=1;i<=541;i++){
               int p = 0;
               if(i<=1){
                      continue;
                  }
               for(int j=2;j<i;j++){
                     if(i%j==0){
                          p = 1;
                          break;
                     }
                }
            if(p==0){
                sum+=i;
             }
       }
         System.out.println("SUM : "+sum);                              
     }
 }
