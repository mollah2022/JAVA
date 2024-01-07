
package com.mycompany.beginnerjava;

import java.util.Scanner;

public class ArthematicJava {
    
    public static void main(String[] args){
        
          Scanner input = new Scanner(System.in);
          
          int num1,num2,result;
          
          System.out.print("Enter the Frist number : ");
           num1 = input.nextInt();
            
            System.out.print("Enter the Seconf number : ");
            num2 = input.nextInt();
            
            result = (num1+num2);
            System.out.println("SUM = "+result);
            
            result = (num1-num2);
           System.out.println("SUB = "+result);
           
            result = (num1*num2);
           System.out.println("MAL = "+result);
           
           double result1 = (double)num1/num2;
           System.out.println("DIV = "+result1);
           
            result = num1%num2;
           System.out.println("REM = "+result);
    }
    
}
