/* Day 44 coding Statement : Write Program to find number of even and odd elements in an array

Description

Get an array as input from the user and then count the number of even and odd elements present in the array.

Input

Enter size of array

4

Enter the elements :

1 3 4 5

Output

Number of even elements :

1

Number of odd elements :

3 */

import java.util.*;
public class Day44
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int even = 0;
        int odd = 0;
        System.out.println("Enter the Elements:");
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
            if(a[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Number of Even Elements:"+even);
        System.out.println("Number of Odd Elements:"+odd);
    }
}
