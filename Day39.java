/* Day 39 coding Statement : Write a Program to check if two strings are Anagram or not

Description

Get two strings as input from the user and check whether it is Anagram or not.

Input

sunlight thgiluns

Output

Anagram */

import java.util.*;
public class Day39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length())
        {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result)
            {
                System.out.println("Anagram.");
            }
            else
            {
                System.out.println("Not Anagram.");
            }
        }
        else
        {
            System.out.println("Not Anagram.");
        }

    }
}
