/* Day 14 coding Statement : Write a program to reverse a given number

Description

Get an input from the user and the print the reverse of the given number as the output

E.g. let the number be 324 then the reverse of the number is 423

Input

675

Output

576 */
import java.util.*;
public class Day14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while(n != 0)
        {
            int rem = n%10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
