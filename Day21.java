/* Day 21 coding Statement : Write a program to identify if the number is Palindrome or not

Description

Get a number as input from the user and check whether that number is a Palindrome or not.

Input

121

Output

Palindrome

Input

34

Output

Not a Palindrome */

import java.util.*;
public class Day21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum=0;
        while(n != 0)
        {
            int rem = n%10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        if(temp == sum)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
