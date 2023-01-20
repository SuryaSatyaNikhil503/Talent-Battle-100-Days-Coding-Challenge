/* Day 25 coding Statement : Write a program to find Area of a circle

Description

Get the value for radius from the user and calculate the area of the circle for the given radius.

Area of circle = 3.14*radius*radius

Input

3

Output

28.26 */

import java.util.*;
public class Day25
{
    static double pi = 3.14;
    static double areaOfCircle(double pi , double r)
    {
        return pi*Math.pow(r,2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(areaOfCircle(pi,r));
    }
}
