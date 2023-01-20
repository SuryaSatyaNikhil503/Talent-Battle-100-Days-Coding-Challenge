/* Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not

Description

Get an input number from user and check whether the given number is an Armstrong number or not.

E.g. Let the number be 1634,

Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

Therefore, this is an Armstrong number

Input

153

Output

Armstrong number

Input

121

Output

Not an Armstrong number  */

import java.util.*;
public class Day19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, originalNum, remainder, n = 0;
        double result = 0.0;
        num = sc.nextInt();
        originalNum = num;
        for (originalNum = num; originalNum != 0; ++n)
        {
            originalNum /= 10;
        }

        for (originalNum = num; originalNum != 0; originalNum /= 10)
        {
            remainder = originalNum % 10;
            result = (int)result + Math.pow(remainder, n);
        }
        if (result == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
