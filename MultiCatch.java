public class MultiCatch{

    public static void main(String [] args){
        try {
           int a[]=new int[5];
           a[5]=10/10; 
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");   
           }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");   
           }
        catch (Exception e) {
         System.out.println("Parent Exception");   
        }
        int x=-5;
        System.out.println("Hello:"+x); 
    }
}
