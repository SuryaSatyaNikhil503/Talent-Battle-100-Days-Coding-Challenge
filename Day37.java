/*Day 37 coding Statement : Write a Program to calculate the Frequency of characters in a string

Description

Get a string as the input from the user and find the frequency of characters in the string.

Input

program

Output

The frequency of a is 1

The frequency of g is 1

The frequency of m is 1

The frequency of o is 1

The frequency of p is 1

The frequency of r is 2 */

import java.util.*;
public class Day37
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[str.length()];
        int i, j;
        char string[] = str.toCharArray();

        for(i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    string[j] = '0';
                }
            }
        }
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println("The frequency of "+string[i] + " "+"is" + " "+freq[i]);
        }
    }
}
