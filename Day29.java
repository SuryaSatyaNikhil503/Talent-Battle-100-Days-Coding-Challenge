/* Day 29 coding Statement : Write a Program to concatenate a string.

Description

Get two strings as input from the user and then concatenate it.

Input

Enter first string

Hello

Enter second string

Hi

Output

HelloHi */

import java.util.*;
public class Day29
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String:");
        String str = sc.next();
        System.out.print("Enter Second String:");
        String str2 = sc.next();
        String str3 = str.concat(str2);
        System.out.println(str3);
    }
}
