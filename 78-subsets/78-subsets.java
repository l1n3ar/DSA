class Solution {
   
    public List<List<Integer>> subsets(int[] nums) {
        
   
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        
        findSubsets(nums,0,current,res);
        
         return res;
        
}
        
    
    public static void findSubsets(int[] arr, int currentIndex, ArrayList<Integer> current, List<List<Integer>> res){
        
    
        if(currentIndex == arr.length){
            res.add(new ArrayList<>(current));
            return;
        }
        
        
        current.add(arr[currentIndex]);
        findSubsets(arr, currentIndex + 1, current,res);
        current.remove(current.size() - 1);
        findSubsets(arr,currentIndex+1,current,res);
        
    }
}