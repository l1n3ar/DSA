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
        
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();//taking number n
            
            //calling digitalRoot() function of 
            //class Digital
            System.out.println(new Solution().digitalRoot(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
        if(n < 10) return n;
        int currentSum = n%10 + digitalRoot(n/10);
        if(currentSum >= 10){
            return currentSum%10 + digitalRoot(currentSum/10);
        }
        
        return currentSum;
    }
}