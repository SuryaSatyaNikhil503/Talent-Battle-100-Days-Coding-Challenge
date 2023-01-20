/* Day 40 coding Statement : Write a Program to Replace substring in a string

Description

Get a string as input from the user and then get another string which has to be removed from the string.

Get the third input, the new substring which is placed in that substring position.

Finally print the output by replacing the substring with new string.

Input

Enter a string

talentbattle

Enter the substring to be removed :

talent

Enter the new substring :

student

Output

The new string :

studentbattle*/

import java.util.*;
public class Day40
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the string to be removed: ");
        String sub = sc.nextLine();
        System.out.print("Enter the new string: ");
        String newstr =sc.nextLine();
        String repstr = str.replace(sub, newstr);
        System.out.println("New String is :"+repstr);
    }
}
