class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];
        int current = nums[0];
        
        for(int i = 1;i<nums.length;i++){
            
            current = Math.max(current + nums[i], nums[i]);
            max = Math.max(current, max);
        }
        
        return max;
        
    }
}