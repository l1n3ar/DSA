class Solution {
    
    class Pair{
        
        int val;
        int freq;
        
        Pair(int val, int freq){
            this.val = val;
            this.freq = freq;
        }
        
    }
    
    
    public int[] topKFrequent(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int current = nums[i];
            map.put(current, map.getOrDefault(current, 1) + 1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.freq-a.freq);
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            pq.add(new Pair(e.getKey(), e.getValue()));
        }
        
        int[] res = new int[k];
        int index = 0;
        
        while(index < k){
            Pair current = pq.poll();
            res[index] = current.val;
            index++;
        }
        
        return res;
    }
}