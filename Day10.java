/* Day 10 coding Statement:  Write a program to find Factorial of a number

Description

Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.

Input

4

Output

24 */
import java.util.*;
public class Day10
{
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));
    }
}
