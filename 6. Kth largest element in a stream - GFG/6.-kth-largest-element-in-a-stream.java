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
            arr[i] = -1;
        }
        pq.add(arr[k-1]);
        arr[k-1] = pq.peek();
        for(int i = k;i<n;i++){
            int current = arr[i];
            if(current > pq.peek()){
                pq.poll();
                pq.add(current);
                arr[i] = pq.peek();
            }
           else arr[i] = pq.peek();
        }
        
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}