// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking n as input
            System.out.println(new Solution().fibonacci(n)); // print the nth fibonacci number
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int fibonacci(int n)
    {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        return arr[n];
    }
}


