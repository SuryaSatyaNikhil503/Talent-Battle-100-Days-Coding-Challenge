/* Day 33 coding Statement : Write a Program to check if String is a palindrome or not

Description

Get an input string from the user and then check whether it is a palindrome string or not.

Input

noon

Output

Palindrome

Input

Talent

Output

Not a Palindrome*/

import java.util.*;
public class Day33
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        boolean flag = true;


        int left = 0;
        int right = str.length()-1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                flag = false;
                break;
            }
            else
            {
                left += 1;
                right -= 1;
            }
        }
        if(flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
