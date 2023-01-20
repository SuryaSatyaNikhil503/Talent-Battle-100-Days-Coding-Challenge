/* Day 51 coding Statement : Given an integer array of size N, write a program to sort the array;

Sample input 1:

4

2 4 1 3

Sample output 1:

1 2 3 4

Sample input 2:

5

1 5 7 5 3

Sample output 2:

1 3 5 5 7 */

import java.util.*;
public class Day51
{
    static void merge(int arr[] , int l , int mid , int r)
    {
        int i, j, k;
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (i = 0; i < n1; i++)
        {
            L[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++)
        {
            R[j] = arr[mid + 1 + j];
        }
        i = 0;
        j=0;
        k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int arr[] , int l , int r)
    {
        if(l<r)
        {
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr,mid+1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr , 0 , arr.length-1);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
