/* Day 38 coding Statement : Write a Program to print Non-repeating characters in a string

Description

Get a string as the input from the user and print the non-repeating characters in a string.

Input

Hello

Output

H e o */

import java.util.*;
public class Day38
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int max_count = 0;
        char max_char=Character.MIN_VALUE;
        String str = sc.nextLine();
        int[] arr = new int[256];
        for(int i = 0; i < str.length(); i++)
        {
            arr[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++)
        {
            if (arr[i] == 1)
            {
                System.out.print((char)i+" ");
            }
        }
    }
}
