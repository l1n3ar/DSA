class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0] = 1;
        right[nums.length-1] = 1;
        
        int running = 1;
        
        for(int i = 1;i<nums.length;i++){
            left[i] = running * nums[i-1];
            running*=nums[i-1];
        }
        
        running = 1;
        
        for(int i = nums.length - 2;i>=0;i--){
            right[i] = running * nums[i+1];
            running*=nums[i+1];
        }
        
        for(int i = 0;i<nums.length;i++){
            res[i] = left[i] * right[i];
        }
        
        return res;
    }
}