/* Day 42 coding Statement : Write Program to check if two arrays are the same or not

Description

Get two arrays as the input from the user and check whether it is the same or not.

Input

Enter the size of first array :

3

Enter the size of second array :

3

Enter elements of first array :

1 2 3

Enter elements of second array :

1 2 3

Output

Same */

import java.util.*;
public class Day42
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of First Array:");
        int n = sc.nextInt();
        System.out.print("Enter Size of Second Array:");
        int m = sc.nextInt();
        if(n != m)
        {
            System.out.println("Not Same");
            return;
        }
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int flag = 0;
        System.out.println("Enter Elements of First Array:");
        for(int i=0 ; i<n ; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Elements of Second Array:");
        for(int i=0 ; i<m ; i++)
        {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0 ; i<n ; i++)
        {
            if(arr1[i] != arr2[i])
            {
                flag = 1;
            }
        }
        //System.out.println("Same");
        if(flag == 1)
        {
            System.out.println("Not Same");
        }
        else
        {
            System.out.println("Same");
        }
    }
}
