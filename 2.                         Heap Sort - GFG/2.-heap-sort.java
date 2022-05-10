// { Driver Code Starts
import java.util.*;
class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                
            Solution ob=new Solution();
            ob.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
    
}


// } Driver Code Ends


class Solution
{
    
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        for(int i = (n-2)/2;i>=0;i--){
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        
        if(i >= n) return;
        
        
        
         int left = (2*i) + 1;
         int right = (2*i) + 2;
         
         int current = i;
         int largest = arr[i];
         int largestIndex = current;
         
         if(left < n && arr[left] > arr[current]){
             largest = arr[left];
             largestIndex = left;
         }
         
         if(right < n && arr[right] > largest){
             largest = arr[right];
             largestIndex = right;
         }
         
       if(largestIndex != current){
           swap(arr,current,largestIndex);
           heapify(arr,n,largestIndex);
       }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        buildHeap(arr,n);
        for(int i = n-1;i>=0;i--){
            swap(arr,0, i);
            heapify(arr,i,0);
        }
    }
 }
 
 
