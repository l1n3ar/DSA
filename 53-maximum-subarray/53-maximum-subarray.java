class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int currentSum = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            if(currentSum < 0) currentSum = 0;
            
            currentSum+=nums[i];
            maxSum = Math.max(currentSum, maxSum);
        }
        
        return maxSum;
    }
}