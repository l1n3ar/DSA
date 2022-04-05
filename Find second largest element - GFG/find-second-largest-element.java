// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.print2largest(a,n));
        }
        
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int print2largest(int a[],int n) 
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n;i++){
            int current = a[i];
            
            if(current > first){
                if(first == Integer.MIN_VALUE) first = current;
                else{
                    second = first;
                    first = current;
                }
            }
            else if(current > second && current < first){
                second = current;
            }
        }
        
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}
        
