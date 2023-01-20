/* Day 28 coding Statement : Write a Program to reverse a string.

Description

Get an input string from user and print it in reverse order.

Input

Hello

Output

olleH */

import java.util.*;
public class Day28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder ans = new StringBuilder();
        ans.append(str);
        ans.reverse();
        System.out.println(ans.toString());
    }
}
