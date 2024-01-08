
package com.mycompany.conditionjava;

import java.util.Scanner;

public class LatterJava {
           
        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            char ch;
            
            System.out.print("Enter the letter:");
            
            ch = input.next().charAt(0);
            
            if(ch == 'Y' || ch == 'y'){
                System.out.println("I Love java");
            }
            else{
                System.out.println("I hate java");
            }
            
    }
    
}
