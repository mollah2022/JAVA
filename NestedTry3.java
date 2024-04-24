public class NestedTry3{
    public static void main(String args[]){
        try {
            System.out.println("Hello ! This is main try");
            try {
                int a=10/0;
               } catch (ArithmeticException e) {
                System.out.println("1st inner try:"+e);
               } 
            try {
                int x[] = new int[5];
                x[14]=10;
               } catch (ArithmeticException e) {
                System.out.println("2nd inner try:"+e);
               }
            
           
        } catch (Exception e) {
            System.out.println("Hello ! This is main catch");
        
        }
        System.out.println("Hello ! This is main method");
    }
}
