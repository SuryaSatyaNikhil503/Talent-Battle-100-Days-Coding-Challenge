/* Day 31 coding Statement : Write a Program to Toggle each character in a string

Description

Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.

Input

Hello

Output

hELLO */

import java.util.*;
public class Day31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(int i=0 ; i<str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                ans = ans+Character.toLowerCase(str.charAt(i));
            }
            else
            {
                ans = ans+Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
