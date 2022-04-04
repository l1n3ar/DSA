// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().sumOfDigits(n)); // computing sum of digits of n
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        if(n < 10) return n;
        return (n%10 + sumOfDigits(n/10));
    }
}

