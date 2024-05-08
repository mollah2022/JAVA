
package javaapplication3;

public class Example2 implements Runnable {
    @Override
    public void run(){
        System.out.println("Thread is running....");
    }
    public static void main(String[] args){
        Example2 m1 = new Example2();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
