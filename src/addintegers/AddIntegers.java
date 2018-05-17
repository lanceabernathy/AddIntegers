/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addintegers;

import java.util.Scanner;

/**
 *
 * @author Lance
 */
public class AddIntegers {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) 
    {
        // TODO code application logic here
        int num1, num2, sum;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your first integer value: ");
        num1 = keyboard.nextInt();
        
        System.out.println("Enter your second integer value: ");
        num2 = keyboard.nextInt();
        
        sum = num1 + num2;
        System.out.println("The sum of your two numbers is " + sum);
    }
    
}
