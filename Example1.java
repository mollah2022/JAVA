
package javaapplication3;

public class Example1 extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
    public  static void main(String[] args){
        Example1 t1 = new Example1();
        t1.start();
    }
}
