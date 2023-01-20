/* Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer

Description

Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it.

Input

310020

Output

311121 */

import java.util.*;
public class Day23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = 1;
        int sum = 0;
        while(n != 0)
        {
            int rem = n%10;
            if(rem == 0)
            {
                rem = 1;
            }
            n = n/10;
            sum = sum+rem*base;
            base *= 10;
        }
        System.out.println(sum);
    }
}
