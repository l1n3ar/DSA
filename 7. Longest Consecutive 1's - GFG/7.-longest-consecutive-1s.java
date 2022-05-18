// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int n) {
        
        // Your code here
        int max = Integer.MIN_VALUE;
        int current = 0;
        
        while(n != 0){
            
            int currentDigit = n&1;
            if(currentDigit == 1){
                
                current++;
                max = Math.max(current,max);
                
            }else{
                current = 0;
            }
            
            n = n>>1;
        }
        
        
        return max;
        
    }
}



// { Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}


  // } Driver Code Ends