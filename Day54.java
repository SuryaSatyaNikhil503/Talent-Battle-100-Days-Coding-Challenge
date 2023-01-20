/* Day 54 coding Statement : Given an integer array of size N. Write Program to find whether Arrays are disjoint or not. Two arrays are said to be disjoint if they have no elements in common.

Sample input 1:

4

2 -4 -1 -3

3

1 3 5

Sample output 1:

Disjoint

Sample input 2:

5

1 5 -7 6 3

4

2 4 6 8

Sample output 2:

Not disjoint. ( 6 is common) */

import java.util.*;
public class Day54
{
    static boolean disJoint(int[] arr1 , int[] arr2)
    {
        HashSet<Integer> ans = new HashSet<>();
        for(int i=0 ; i<arr1.length ; i++)
        {
            ans.add(arr1[i]);
        }
        for(int i=0 ; i<arr2.length ; i++)
        {
            if(ans.contains(arr2[i]))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0 ; i<m ; i++)
        {
            arr2[i] = sc.nextInt();
        }
        if(disJoint(arr1 , arr2)==true)
        {
            System.out.println("Disjoint");
        }
        else
        {
            System.out.println("Not Disjoint");
        }
    }
}
