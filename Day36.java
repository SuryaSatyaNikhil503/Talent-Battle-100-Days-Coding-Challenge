/* Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string

Description

Get a string from the user and then change the first and last letter to uppercase.

Input

programming

Output

ProgramminG */

import java.util.*;
public class Day36
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            int k = i;
            while (i < ch.length && ch[i] != ' ')
                i++;
            ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z' ? ((int)ch[k] - 32) : (int)ch[k]);
            ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z' ? ((int)ch[i - 1] - 32) : (int)ch[i - 1]);
        }

        System.out.println(new String(ch));
    }
}
