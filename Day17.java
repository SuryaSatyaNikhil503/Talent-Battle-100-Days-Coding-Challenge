/* Day 17 coding Statement : Write a program to find the Factors of a number

Description

Get an input from the user and find the factors of the number.

Input

4

Output

1,2,4  */

import java.util.*;
public class Day17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int flag = 0;
        for(i=1 ; i<=Math.sqrt(n) ; i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
            if(i==n/i)
            {
                flag = 1;
            }
        }
        if(flag==1)
        {
            i-=2;
        }
        for(; i>=1 ; i--)
        {
            if(n%i==0)
            {
                System.out.print(n/i+" ");
            }
        }
    }
}
