class Solution {
    public boolean canJump(int[] nums) {
        
        int goal = nums.length - 1;
        
        for(int i = nums.length - 2;i>=0;i--){
            int current = nums[i];
            int currentIndex = i;
            
            if(current + currentIndex >= goal) goal = currentIndex;
        }
        
        
        
        
        return goal == 0;
    }
}