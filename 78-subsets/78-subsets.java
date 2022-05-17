class Solution {
   
    public List<List<Integer>> subsets(int[] nums) {
        
   
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        
        findSubsets(nums,0,current,res);
        
         return res;
        
    }
        
    
    public static void findSubsets(int[] arr, int currentIndex, ArrayList<Integer> current, List<List<Integer>> res){
        
    
        if(!res.contains(current)) res.add(current);
        if(currentIndex == arr.length) return;
        
        ArrayList<Integer> temp = new ArrayList<>(current);
        temp.add(arr[currentIndex]);
        findSubsets(arr,currentIndex+1,current,res);
        findSubsets(arr,currentIndex+1,temp,res);
        
    }
}