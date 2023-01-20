/* Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description

Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

Input

121

Output

Not a strong number

Input

2

Output

Strong number */

import java.util.*;
public class Day15
{
    static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n != 0)
        {
            int rem = n % 10;
            int fct = factorial(rem);
            //System.out.println(fct);
            sum +=fct;
            //System.out.println(sum);
            n = n / 10;
        }
        if(sum == temp)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }
    }
}
