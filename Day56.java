/* Day 56 coding Statement : Write Program to find whether the numbers of an array be made equal

Description

Check whether the numbers of array be made equal or not

For eg, for the following input it should print yes because

50*2*3 , 75*2*2 and 150*2 are equal to 300 in all cases. So array numbers can be made equal

Input

3
50 75 150

Output

Yes */

import java.util.*;
public class Day56
{
    static boolean equal(int arr[] , int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            while(arr[i]%2==0)
            {
                arr[i]/=2;
            }
            while(arr[i]%3==0)
            {
                arr[i]/=3;
            }
        }
        for(int i=1 ; i<n ; i++)
        {
            if(arr[i] != arr[0])
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
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        if(equal(arr,n)) System.out.println("Yes");
        else System.out.println("No");
    }
}
