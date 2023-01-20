/* Day 53 coding Statement : Given an integer array of size N. Write Program to find maximum product subarray in a given array.

Sample input 1:

4

2 -4 -1 -3

Sample output 1:

8 = {2, -4, -1}

Sample input 2:

5

1 5 -7 5 3

Sample output 2:

15 = {5, 3} */

import java.util.*;
public class Day53
{
    static int maxProduct(int[] nums)
    {
        if (nums.length == 0) return 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            int accu = 1;
            for (int j = i; j < nums.length; j++)
            {
                accu *= nums[j];
                result = Math.max(result, accu);
            }
        }

        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProduct(nums));
    }
}
