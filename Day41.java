/* Day 41 coding Statement : Check if two strings match where one string contains wildcard characters

Description

Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.

Then check whether they match or not.

Input

Ta**nt

Talent

Output

Yes they match */

import java.util.*;
public class Day41
{
    static boolean match(String str1 , String str2)
    {
        if(str1.length()==0 && str2.length()==0)
        {
            return true;
        }
        if (str1.length() > 1 && str1.charAt(0) == '*')
        {
            int i=0;
            while (i+1<str1.length() && str1.charAt(i+1) == '*')
            {
                i++;
            }
            str1 = str1.substring(i);
        }
        if (str1.length() > 1 && str1.charAt(0) == '*' && str2.length() == 0)
        {
            return false;
        }
        if ((str1.length() > 1 && str1.charAt(0) == '?') || (str1.length() != 0 && str2.length() != 0 && str1.charAt(0) == str2.charAt(0)))
        {
            return match(str1.substring(1), str2.substring(1));
        }
        if (str1.length() > 0 && str1.charAt(0) == '*')
        {
            return match(str1.substring(1), str2) || match(str1, str2.substring(1));
        }
        return false;
    }
    static void checker(String str1 , String str2)
    {
        if (match(str1, str2))
            System.out.println("Yes they match");
        else
            System.out.println("No they don't match");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        checker(str1 , str2);
    }
}
