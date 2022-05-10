// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java
public class Element implements Comparable<Element>{
    int value;
    int positionOfArray;
    int indexOfElementInArray;
    
    Element(int value, int positionOfArray, int indexOfElementInArray){
        this.value = value;
        this.positionOfArray = positionOfArray;
        this.indexOfElementInArray = indexOfElementInArray;
    }
    
    public int compareTo(Element e){
        return this.value - e.value;
    }
}

class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(int i = 0;i<k;i++){
            pq.add(new Element(arr[i][0],i,0));
        }
        
        while(!pq.isEmpty()){
            
            Element current = pq.peek();
            
            int currentValue = current.value;
            int currentArray = current.positionOfArray;
            int currentIndex = current.indexOfElementInArray;
            
            
            res.add(currentValue);
            pq.poll();
            
            if(currentIndex < arr[currentArray].length-1){
                pq.add(new Element(arr[currentArray][currentIndex+1],currentArray, currentIndex+1));
            }
            
            else continue;
            
        }
        
        return res;
    }
}