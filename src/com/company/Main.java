package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        double side1;
        double side2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the sides of your rectangle");
        System.out.println("Enter the length of side 1: ");
        if (in.hasNextDouble())
        {
            side1 = in.nextDouble();
            System.out.println("Enter the length of side 2: ");
            if (in.hasNextDouble())
            {
                side2 = in.nextDouble();
                System.out.println("The area of your rectangle is: " + side1 * side2);
                System.out.println("The perimeter of your rectangle is: " + (side1 * 2 + side2 * 2));
                System.out.println("The diagonal length of your rectangle is: " + Math.sqrt(side1 * side1 + side2 * side2));
            }
            else
            {
                System.out.println("Error, bad input, please enter a number.");
            }
        }
        else
        {
            System.out.println("Error, bad input, please enter a number.");
        }
    }
}
