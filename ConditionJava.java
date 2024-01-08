
package com.mycompany.conditionjava;

import java.util.Scanner;


public class ConditionJava {
    
    public static void main(String[] args){
           Scanner input = new Scanner(System.in);
           
           System.out.print("Enter any number :");
           int num1;
           num1 = input.nextInt();
           if(num1%2==0){
                System.out.print("Even\n");
    }
           else{
                System.out.print("Odd\n");
           }
    }
}
