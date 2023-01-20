/* Day 45 coding Statement : Write Program to find smallest and largest element in an array

Description

Get an array as input from the user and then find the smallest and largest element in the array.

Input

Enter the size of array :

5

Enter the elements :

10 20 5 40 30

Output

Smallest Number :

5

Largest Number :

40 */

import java.util.*;
public class Day45
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Smallest Number:"+a[0]);
        System.out.println("Largest Number:"+a[n-1]);
    }
}
