/* Day 6 coding Statement:  Write a program to find the Quadrants in which coordinates lie

Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.

Input

10 20

Output

This point lies in first quadrant.

Input

-10 20

Output

This point lies in second quadrant. */

import java.util.*;
public class Day6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>0 && b>0)
        {
            System.out.println("This Point lies in First Quadrant");
        }
        else if(a<0 && b>0)
        {
            System.out.println("This Point lies in Second Quadrant");
        }
        else if(a<0 && b<0)
        {
            System.out.println("This Point lies in Third Quadrant");
        }
        else
        {
            System.out.println("This Point lies in fourth Quadrant");
        }
    }
}
