/* Day 30 coding Statement : Write a Program to print Length of the string without using strlen() function

Description

Get a string as input from user and print the length of the string without using strlen() function.

Input

Hello

Output

5 */

import java.util.*;
public class Day30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        System.out.println(ch.length);
    }
}
