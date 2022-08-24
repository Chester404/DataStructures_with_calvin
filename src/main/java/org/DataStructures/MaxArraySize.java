package org.DataStructures;
/**
 * Write a program that takes an integer N and an array of N integers as input. You must return the size of the
 * maximum array you can get by removing some elements from the inputted array, such that this array becomes an
 * increasing/decreasing array.
 *
 * Note: The integer N will be given in the first line and the array of N integers will be given in the second
 * line (each integer separated by a single space).
 *
 * Note2: An array is increasing/decreasing if all the first elements are strictly increasing and then strictly
 * decreasing. Meaning that there's exactly one position of the array, such that the elements before it stop
 * increasing and then decrease until the end of the array.
 *
 * Example:
 *
 * Case 1:
 * For the input provided as follows:
 * 3
 * 1 2 3
 * Output of the program will be:
 * 3
 * Description of the output:
 * The whole array is strictly increasing, so if we pick the last element then all elements before it are strictly
 * increasing and all elements after it are strictly decreasing.
 *
 * Case 2:
 * For the input provided as follows:
 * 4
 * 1 2 2 1
 * Output of the program will be:
 * 3
 * Description of the output:
 * The best solution is to remove one 2 from the array such that we get 1 2 1, which is the maximum answer we can get.
 */
public class MaxArraySize {
static int max_ref;
    static int _lis( int n, int arr[])
    {
        // base case
        if (n == 1)
            return 1;

        // 'max_ending_here' is length of LIS ending with
        // arr[n-1]
        int res, max_ending_here = 1;

        /* Recursively get all LIS ending with arr[0],
           arr[1] ... arr[n-2]. If   arr[i-1] is smaller
           than arr[n-1], and max ending with arr[n-1] needs
           to be updated, then update it */
        for (int i = 1; i < n; i++) {
            res = _lis( i, arr);
            if (arr[i - 1] < arr[n - 1]
                    && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }

        // Compare max_ending_here with the overall max. And
        // update the overall max if needed
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;

        // Return length of LIS ending with arr[n-1]
        return max_ending_here;
    }

    static int lis(int arr[], int n)
    {
        // The max variable holds the result
        max_ref = 1;

        // The function _lis() stores its result in max
        _lis(n,arr);

        // returns max
        return max_ref;
    }


        //Getting the longest increasing only
        // taking input array into an array list
        //use array list method to traverse through array list
        //compare current index to next index, if current less than next put current and next into arrayList else skip
        // move to next index

        //inputArray



    public static void main(String[] args) {

         int[] values = {1,2,3,2,1,7,5,9,10};
         int a = values.length;

        System.out.println("Longest incremental array size = "+lis(values, a));
    }
}