
package com.mycompany.conditionjava;

import java.util.Scanner;

public class NesletJava {
       public static void main(String[] args) {
           
          Scanner input = new Scanner(System.in);
          int num1,num2;
          System.out.print("Enter the two number:");
          
          num1 = input.nextInt();
          num2 = input.nextInt();
          
          if(num1>num2){
              System.out.println("Frist number is larger");
          }
          else if(num2>num1){
              System.out.println("Second number is larger");
          }
          else{
              System.out.println("The number are 10");
          }
          
    }
               
               
}
