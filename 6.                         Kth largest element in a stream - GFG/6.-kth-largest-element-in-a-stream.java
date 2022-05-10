// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    while(t-- > 0){
	        int k=scan.nextInt();
	        int n=scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=scan.nextInt();
	        
	        new Solution().kthLargest(a, n, k);
	        System.out.println();
	    }
	 }
}// } Driver Code Ends


class Solution
{
    //Function to print kth largest element for each element in the stream.
    public void kthLargest(int arr[], int n, int k){
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<k-1;i++){
            pq.add(arr[i]);
           System.out.print("-1" + " ");
        }
        pq.add(arr[k-1]);
        for(int i = k;i<n;i++){
          System.out.print(pq.peek() + " ");
          int current = arr[i];
          int currentFromQueue = pq.peek();
          
          if(current > currentFromQueue){
               pq.poll();
              pq.add(current);
             
          }
        }
        
        System.out.print(pq.poll()+" ");
     
    }
}