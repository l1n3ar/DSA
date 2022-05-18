// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

//Back-end complete function Template for Java

class Solution{
    
    //  Function to find the gray code of given number n
    public static int greyConverter(int n) {
        
        // Your code here
        
        return (n ^ (n>>1));
        
    }
    
}



// { Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling greyConverter() method
		    System.out.println(obj.greyConverter(n));
		}
	}
}


  // } Driver Code Ends