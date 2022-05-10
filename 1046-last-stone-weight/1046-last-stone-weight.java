class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
        
        while(pq.size() >= 2){
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            
            if(stone1 == stone2) continue;
            else{
                pq.add(stone1 - stone2);
            }
            
        }
        
        if(pq.size() == 0) return 0;
        return pq.peek();
    }
}