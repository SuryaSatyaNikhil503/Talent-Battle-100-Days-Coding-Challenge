/* Day 48 coding Statement : Write Program to remove duplicate elements in an array

Description

Get an array as input from the user and then remove all the duplicate elements in that array.

Input

Enter the size of array

5

Enter the elements of array

35 35 45 60 60

Output

35 45 60 */

import java.util.*;
public class Day48
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements");
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<n ; i++)
        {
            set.add(a[i]);
        }
        System.out.println(set);
    }
}
