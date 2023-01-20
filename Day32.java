/* Day 32 coding Statement : Write a Program to Remove vowels from a string

Description

Get a string as the input from the user and then remove all the vowel letters from the string and give the output.

Input

remove

Output

rmv */

import java.lang.*;
import java.util.*;
public class Day32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        StringBuilder temp = new StringBuilder();
        String ans = "";
        Stack<Character> st = new Stack<>();
        //char[] ans = new char[str.length()];
        for(char i : ch)
        {
            st.push(i);
            if(i == 'a' || i=='A')
            {
                st.pop();
            }
            else if(i == 'e' || i=='E')
            {
                st.pop();
            }
            else if(i == 'i' || i=='I')
            {
                st.pop();
            }
            else if(i == 'o' || i=='O')
            {
                st.pop();
            }
            else if(i == 'u' || i=='U')
            {
                st.pop();
            }
        }
         //System.out.println(st);
        //System.out.println(temp);
        while(!st.isEmpty())
        {
            temp.append(st.pop());
        }
        //System.out.println(ans.);
        ans = String.valueOf(temp.reverse());
        System.out.println(ans);
    }
}
