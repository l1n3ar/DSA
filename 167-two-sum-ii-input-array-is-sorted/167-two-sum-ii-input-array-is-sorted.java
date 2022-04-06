class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length-1;
        
        while(left < right){
            int currentSum = numbers[left] + numbers[right];
            if(currentSum == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }else if(currentSum < target) left++;
             else right--;
        }
        
        
        
        return result;
    }
}