
package javaapplication3;

public class Example4 implements Runnable{
    @Override
    public void run(){
        System.out.println("Now The Thread is Running");
    }
    public static void main(String[] args){
        Runnable r1 = new Example4();
        Thread th1 = new Thread(r1,"My new Thread");
        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
}
