class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length == 0) return true;
        
        boolean[] can = new boolean[nums.length];
        can[nums.length - 1] = true;
        
        for(int i = nums.length-2;i>=0;i--){
            int maxJumpFromCurrentIndex = nums[i];
            int currentIndex = i;
            if(nums[i] == 0) can[currentIndex] = false;
            else if(maxJumpFromCurrentIndex + currentIndex >= nums.length - 1) can[currentIndex] = true;
            else{
                for(int j = 1;j<=maxJumpFromCurrentIndex;j++){
                    if(can[j+currentIndex]) can[currentIndex] = true;
                }
            }
            }
        
             return can[0];
        }
        
   
    }
