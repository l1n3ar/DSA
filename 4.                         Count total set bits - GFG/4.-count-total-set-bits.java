// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Ignore 0 as all the bits are unset
    n++;

    // To store the powers of 2
    int powerOf2 = 2;

    // To store the result, it is initialized
    // with n/2 because the count of set
    // least significant bits in the integers
    // from 1 to n is n/2
    int cnt = n / 2;

    // Loop for every bit required to represent n
    while (powerOf2 <= n)
    {

        // Total count of pairs of 0s and 1s
        int totalPairs = n / powerOf2;

        // totalPairs/2 gives the complete
        // count of the pairs of 1s
        // Multiplying it with the current power
        // of 2 will give the count of
        // 1s in the current bit
        cnt += (totalPairs / 2) * powerOf2;

        // If the count of pairs was odd then
        // add the remaining 1s which could
        // not be groupped together
        cnt += (totalPairs % 2 == 1) ? 
                      (n % powerOf2) : 0;

        // Next power of 2
        powerOf2 <<= 1;
    }

    // Return the result
    return cnt;
    }
}

// { Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}
  // } Driver Code Ends