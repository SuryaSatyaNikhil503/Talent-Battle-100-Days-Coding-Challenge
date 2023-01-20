/* Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.

Input

3241

Output

4 I

nput

6

Output

1*/

import java.util.*;
public class Day9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(n!=0)
        {
            int rem = n%10;
            cnt+=1;
            n = n/10;
        }
        System.out.println(cnt);
    }
}
