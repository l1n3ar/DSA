// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int num = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[num];
            for(int i = 0; i < num; i++)
                arr[i] = sc.nextInt();
            
            ArrayList <Integer> res = new Solution().nearlySorted(arr, num, k);
            for (int i = 0; i < res.size (); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0;i<=k;i++){
            pq.add(arr[i]);
        }
        
        int index = 0;
        
        for(int i = k+1;i<num;i++){
            arr[index] = pq.poll();
            index++;
            pq.add(arr[i]);
        }
        
        while(!pq.isEmpty()){
            arr[index] = pq.poll();
            index++;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : arr){
            result.add(i);
        }
        
        return result;
    }
}
