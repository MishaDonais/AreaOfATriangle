/*
 * This program was amde by Misha Donais
 * On feb 18th 2019
 * To calculate the area of a triangle
 */
package areaofatriangle;
//Imports

import java.util.Scanner;
import java.lang.Math;

public class AreaOfATriangle {

    public static void main(String[] args) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Getting measurements from the user
        System.out.println("Enter the length of side A in cm");
        double sideA = keyedInput.nextDouble();
        System.out.println("Enter the length of side B in cm");
        double sideB = keyedInput.nextDouble();
        System.out.println("Enter angle C in degrees");
        double angleC = keyedInput.nextDouble();
        
        //Calculations 
        double area = (sideA+sideB+Math.sin(angleC)/2);
        
        //Output
        System.out.println("The area of this triangle is: " + area +" cm^2");
    }
    
}
