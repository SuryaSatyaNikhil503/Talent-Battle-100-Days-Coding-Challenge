/* Day 52 coding Statement : Given an integer array of size N, write a program to reverse the array;

Sample input 1:

4

2 4 1 3

Sample output 1:

3 1 4 2

Sample input 2:

5

1 5 7 5 3

Sample output 2:

3 5 7 5 1 */

import java.util.*;
public class Day52
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ans[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int j=n;
        for(int i=0 ; i<n ; i++)
        {
            ans[j-1] = arr[i];
            j=j-1;
        }
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
