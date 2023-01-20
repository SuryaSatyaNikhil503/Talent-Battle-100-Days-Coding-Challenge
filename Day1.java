/* Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.

        Description of the program:


        Take an input character from the user and check whether the given input is a vowel or consonant.

        Input
        A

        Output
        Vowel

        Input
        m

        Output
        Consonant

        Input
        3

        Output
        Invalid Input */

import java.util.*;
public class Day1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U')
        {
            System.out.println("Vowel");
        }
        else if(Character.isDigit(ch)==true)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Consonent");
        }
    }
}
