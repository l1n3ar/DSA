class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        boolean[] can = new boolean[n];
        
        can[n-1] = true;
        
        for(int i = n-2;i>=0;i--){
            int maxJumpFromCurrentIndex = nums[i];
            int currentIndex = i;
            
            if(currentIndex + maxJumpFromCurrentIndex >= n-1) can[currentIndex] = true;
            else{
                for(int j = currentIndex + 1;j<=currentIndex + maxJumpFromCurrentIndex;j++){
                    if(can[j]) can[currentIndex] = true;
                }
            }
        }
        
        return can[0];
        
    }
}