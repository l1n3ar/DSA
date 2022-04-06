class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            
            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum == 0){
                    ArrayList<Integer> current = new ArrayList<>();
                    current.add(nums[i]);
                    current.add(nums[left]);
                    current.add(nums[right]);
                    set.add(current);
                    left++;
                    right--;
                }else if(currentSum < 0) left++;
                else right--;
            }
        }
        
       for(List<Integer> list: set){
           result.add(list);
       }
        
        return result;
    }
}