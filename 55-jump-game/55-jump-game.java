class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length == 0) return true;
        
        int n = nums.length;
        
        boolean[] can = new boolean[n];
        can[n-1] = true;
        
        for(int i = n-2;i>=0;i--){
            
            int maxJumpFromCurrentIndex = nums[i];
            int currentIndex = i;
            
            if(maxJumpFromCurrentIndex == 0) can[currentIndex] = false;
            else if(maxJumpFromCurrentIndex + currentIndex >= n-1) can[currentIndex] = true;
            else{
                for(int j = 1;j<=maxJumpFromCurrentIndex;j++){
                    if(can[j+currentIndex]) can[currentIndex] = true;
                }
            }
            
        }
        
        
        
        return can[0];
        
        
    }
}