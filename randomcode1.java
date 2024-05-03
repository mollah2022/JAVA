
package mavenproject1;

import java.util.Scanner;

public class randomcode1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int[] array1 = new int[n];
        System.out.println("Input the Number : ");
        for(int i=0;i<n;i++){
            array1[i] = input.nextInt();
        }
        System.out.println("Output The Value : ");
        for(int i=0;i<n;i++){
            System.out.println(array1[i]);
        }
    }
}
