// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GfG {
    
    
    public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    inputLine = br.readLine().trim().split(" ");
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    int k = Integer.parseInt(br.readLine().trim());
		    Solution ob = new Solution();
		    System.out.println(ob.kMostFrequent(arr, n, k));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to print the sum of frequencies of k numbers
    //with most occurrences in an array.
    int kMostFrequent(int arr[], int n, int k){
       
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0;i<n;i++){
           int current = arr[i];
           if(map.containsKey(current)) map.put(current, map.get(current) + 1);
           else map.put(current, 1);
       }
       int result = 0;
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      
      for(Map.Entry<Integer,Integer> entity : map.entrySet()){
          pq.add(entity.getValue());
      }
       
       int numberOfValues = 0;
       while(numberOfValues < k && !pq.isEmpty()){
           result+=pq.poll();
           numberOfValues++;
       }
       
       return result;
       
    }
}