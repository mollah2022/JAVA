
package javaapplication3;

import java.lang.*;

public class Multithreading extends Thread{
    @Override
    public void run(){
          try{
              // Displaying the thread that is running
              System.out.println("Thread"+Thread.currentThread().getId()+" is running");
          }
          catch(Exception e){
              // Throwing an exception
              System.out.println("Exception is caught");
          }
    }
    public static void main(String args[]){
        for(int i=0;i<=10;i++){
            Multithreading object = new Multithreading();
            object.start();
        }
    }
}
