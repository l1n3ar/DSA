// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            boolean ans=new Solution().arraySortedOrNot(arr, n);
            System.out.println(ans? 1: 0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
       
       for(int i = 0;i<n-1;i++){
           int current = arr[i];
           int next = arr[i+1];
           
           if(current > next) return false;
           
       }
       
       return true;
    }
}