/* Day 18 coding Statement : Write a program to Add two fractions

Description

Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

x3/y3 = (x1/y1) + (x2/y2)

here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

Input

2  3

4  3

Output

2/1 */

import java.util.*;
public class Day18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,x,y,gcd=0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        x = (a*d) + (b*c);
        y = (b*d);

        for(int i=1; i <= x && i <= y; ++i)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }

        System.out.println(x/gcd +"/"+ y/gcd);
        System.out.println();
    }
}
