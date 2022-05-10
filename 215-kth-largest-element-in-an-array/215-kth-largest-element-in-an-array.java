class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0 || k > nums.length) return -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<k;i++){
            pq.add(nums[i]);
        }
        
        for(int i = k;i<nums.length;i++){
            int current = nums[i];
            int currentFromQueue = pq.peek();
            if(current > currentFromQueue){
                pq.poll();
                pq.add(current);
            }
        }
        
        return pq.poll();
     
    }
}