/* Day 47 coding Statement : Write Program to find longest palindrome in an array

Description

Get an array as the input from the user and find the longest palindrome in that array.

Input

Enter the size of array

3

Enter the elements of array

121 10456 1000001

Output

1000001 */

import java.util.*;
public class Day47
{
    static boolean isPalindrome(int n)
    {
        int divisor = 1;
        while (n / divisor >= 10)
            divisor *= 10;
        while (n != 0)
        {
            int leading = n / divisor;
            int trailing = n % 10;
            if (leading != trailing)
                return false;
            n = (n % divisor) / 10;
            divisor = divisor / 100;
        }
        return true;
    }
    static int largestPalindrome(int []A, int n)
    {
        Arrays.sort(A);
        for (int i = n - 1; i >= 0; --i)
        {
            if (isPalindrome(A[i]))
                return A[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println(largestPalindrome(a,n));
    }
}
