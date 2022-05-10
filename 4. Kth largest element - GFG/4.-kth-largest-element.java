// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg {
    public static void main(String args[]) {
        
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            
            //taking count of elements
            int n = sc.nextInt();
            
            //taking the value of k
            int k = sc.nextInt();

            //Creating an array of size n
            int arr[] = new int[n];

            //adding all the elements to arr
            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            //calling the method KthLargest of class solve
            //and printing the result
            System.out.println(new Solution().KthLargest(arr, n, k));
        }
    }
}// } Driver Code Ends




class Solution 
{
    //Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int n, int k) 
    {
        int result  = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0;i<k;i++){
            pq.add(arr[i]);
        }
        
        for(int i = k;i<n;i++){
            int current = arr[i];
            int currentFromQueue = pq.peek();
            if(current > currentFromQueue){
                pq.poll();
                pq.add(current);
            }
        }
        
        return pq.poll();
        
        
        
    }
}