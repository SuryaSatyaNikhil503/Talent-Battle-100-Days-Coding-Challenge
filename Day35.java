/* Day 35 coding Statement : Write a Program to Count the sum of numbers in a string

Description

Get a string from the user and find the sum of numbers in the string.

Input

Hello56

Output

11 */

import java.util.*;
public class Day35
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        char[] arr = str.toCharArray();
        for(int i=0 ; i<arr.length ; i++)
        {
            if ((arr[i] >= '0') && (arr[i] <= '9'))
            {
                sum += (arr[i] - '0');
            }
        }
        System.out.println(sum);
    }
}
