/* Day 22 coding Statement : Write a program to express a number as a sum of two prime numbers

Description

Get a number as input from the user and express that number as sum of two prime numbers.

Input

4

Output

4 can be expressed as sum of 2 and 2 */

import java.util.*;
public class Day22
{
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2 ; i*i<=n ; i++)
        {
            if(n%i==0)
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
        int flag=0;
        for(int i=2 ; i*i<=n ; i++)
        {
            if(isPrime(i)==true)
            {
                int j=n-i;
               if(isPrime(j)==true)
               {
                   System.out.println(n+" "+"can be expressed as sum of" +" "+i+" "+ "and" +" "+ j);
                   flag=1;
               }
            }
        }
        if(flag==0)
        {
            System.out.println(n+" "+"cannot be expressed as sum of two primes");
        }
    }
}
