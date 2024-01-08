
package com.mycompany.conditionjava;

import java.util.Scanner;

public class AgeJava {
    
    public static void main(String[] args){
        
          Scanner input = new Scanner(System.in);
          
          int number;
          
          System.out.print("Enter the number :");
          
          number = input.nextInt();
          
          if(number >= 18){
                System.out.println("Voter");
          }
          else{
              System.out.println("Not voter");
          }
    }
    
}
