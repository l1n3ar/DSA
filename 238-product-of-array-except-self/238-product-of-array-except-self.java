class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] res = new int[n];
        
        int running = 1;
        res[0] = 1;
        
        for(int i = 1;i<n;i++){
            running*=nums[i-1];
            res[i] = running;
        }
        
        running = 1;
        
        for(int i = n-2;i>=0;i--){
            running*=nums[i+1];
            res[i] = running*res[i];
        }
        
        
        
        return res;
        
    }
}