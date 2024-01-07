
package com.mycompany.beginnerjava;

import java.util.Scanner;

public class Userinput {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int id;
        
        System.out.print("ENter the number : ");
        id = input.nextInt();
        System.out.println("The number is : "+id);
        
        String tittle;
        
        System.out.print("TIttle :");
        tittle = input.nextLine();
        System.out.println("The Tittle is : "+tittle);
        
        String price;
        
        System.out.print("Price : ");
        price = input.nextLine();
        System.out.println("Price : "+price);
        
        String des;
        
        System.out.print("Descripation : ");
        des = input.nextLine();
        System.out.println("Descripation : "+des);
        
        String catagory;
        
        
        System.out.print("Catagory : ");
        catagory = input.nextLine();
        System.out.println("Price : "+catagory);
        
    }
    
}
