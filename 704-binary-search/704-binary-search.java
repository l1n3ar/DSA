class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        
        index = binarySearch(nums,target,0,nums.length-1,index);
        
        
        return index;
    }
    
    public static int binarySearch(int[] arr, int target, int left, int right, int index){
        
        
        if(left > right) return -1;
        
        int mid = (left + right)/2;
        
        if(arr[mid] == target){
           return mid;
        }
        
        else if(arr[mid] > target) return binarySearch(arr,target,left,mid-1,index);
        
        return binarySearch(arr,target,mid+1,right,index);
        
    }
}