
package javaapplication3;

import java.util.*;
public class MainExample2 {
    public static void main(String[] args){
    System.out.println("start of main thread");
    Thread newThread=new Thread( new Thread());
    newThread.start();
    try{
    newThread.join();
    }
    catch(InterruptedException e){
    e.printStackTrace();
    }
    System.out.println("end of main thread");
    }
    private static class newThread implements Runnable{
    public void run(){
    System.out.println("start of new thread");
    try{
    Thread.sleep(10000);
    }
    catch(InterruptedException e){
    e.printStackTrace();
    }
    System.out.println("end of new thread");
    }
    }
}
