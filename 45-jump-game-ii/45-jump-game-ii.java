class Solution {
    public int jump(int[] nums) {
        
        int steps[] = new int[nums.length];
        
        steps[nums.length - 1] = 0;
        
        for(int i=nums.length-2;i>=0;i--){
            int maxJumpFromCurrentIndex = nums[i];
            int currentIndex = i;
            
            if(maxJumpFromCurrentIndex + currentIndex >= nums.length - 1) steps[currentIndex] = 1;
            else if(nums[i] == 0) steps[i] = 0;
            else{
                int minJump = Integer.MAX_VALUE;
                for(int j = currentIndex+1;j<=currentIndex + maxJumpFromCurrentIndex;j++){
                    if(steps[j]!=0){
                        minJump = Math.min(minJump, steps[j]);
                    }
                }
                 
                if(minJump == Integer.MAX_VALUE) steps[currentIndex] = 0;
                else steps[currentIndex] = minJump+1;
            }
        }
        
        
        
        return steps[0];
    }
}