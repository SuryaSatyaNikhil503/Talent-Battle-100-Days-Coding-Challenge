/* Day 8 coding Statement:  Write a program to find roots of a quadratic equation

Description

Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.

Input

Enter the value of a, b and c : 1 -6 9

Output

Roots are equal

Root 1= root 2 = 3.00
*/

import java.util.*;
public class Day8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of A,B and C : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double disc = (b*b)+(4*a*c);
        double root1=1;
        double root2=1;
        //double realPart,imagPart;

        //Condition for real and distinct roots
        if(disc > 0)
        {
             root1 = (-b + Math.sqrt(disc)) / 2*a;
             root2 = (-b - Math.sqrt(disc)) / 2*a;
            System.out.println("Roots are real and distinct");
        }
        //Condition for roots are equal
        else if(disc == 0)
        {
             root1 = root2 = -b / (2 * a);
            System.out.println("Roots are real and Equal");
        }
        //if both conditions fail roots are imaginary
        else
        {
            double realpart = -b / (2 * a);
            double imagpart = Math.sqrt(-disc) / (2 * a);
            System.out.println("Roots are Distinct and Imaginary");
        }
    }
}
