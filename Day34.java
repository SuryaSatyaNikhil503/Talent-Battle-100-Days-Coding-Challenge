/*  Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression

Description

Get an algebraic expression as input from the user and then remove all the brackets in that.

Input

7x+(2*y)

Output

7x+2*y */


import java.util.*;
public class Day34
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = str.replaceAll("[(){}]","");
        System.out.println(result);
    }
}
