/* Day 49 coding Statement : Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.

Sample input 1 :

4 1 2 3 4 5 6 7 8

Sample output 1 :

60

Explanation :

(4*5 + 3*6 + 2*7 + 1*8) = 60

Sample input 2 :

4 -1 -2 -3 -4 5 6 -7 -8

Sample output 2 :

-17

Explanation :

(-1*-8 + -2*-7 + -3*6 + -4*5) = -17 */

import java.util.*;
public class Day49
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr1[i] = sc.nextInt();
        for(int i=0 ; i<n ; i++)
            arr2[i] = sc.nextInt();
        //Sort arr1 in ascending order
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr1[i] > arr1[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        //Sort arr2 in descending order
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr2[i] < arr2[j])
                {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        int product = 0;
        for (int i = 0; i < n; i++)
            product += arr1[i] * arr2[i];

        System.out.print(product);
    }
}
