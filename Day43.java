/* Day 43 coding Statement : Write Program to find the array type

Description

Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

Input

Enter size of array :

3

Enter elements

1 3 5

Output

Odd */

import java.util.*;
public class Day43
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int odd = 0 , even = 0;
        System.out.println("Enter Array Elements:");
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else if(a[i]%2 !=0)
            {
                odd++;
            }
        }
        if(odd == n)
        {
            System.out.println("Odd");
        }
        else if(even == n)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}
