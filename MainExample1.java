
package javaapplication3;
import java.util.*;
public class MainExample1 {
    public static void main(String[] args){
        System.out.println("Start of main Thread");
        int sleepTime = 2000;
        try{
            Thread.sleep(sleepTime);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("End of main THread");
    }
}
