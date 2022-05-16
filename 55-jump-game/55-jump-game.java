class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length == 0) return true;
        
        int goal = nums.length - 1;
        
        for(int i = nums.length - 2;i>=0;i--){
            
            int current = nums[i];
            int currentIndex = i;
            
          if(currentIndex + current >= goal) goal = currentIndex;
        }
        
        
        
        
        return goal == 0;
        
    }
}