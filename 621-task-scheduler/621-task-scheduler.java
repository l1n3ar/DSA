class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        if(tasks.length == 0 || n == 0) return tasks.length;
        
        
        int[] freq = new int[26];
        int max = 0;
        int maxCount = 0;
        
        for(char task : tasks){
            freq[task - 'A']++;
            
            if(freq[task - 'A'] == max) maxCount++;
            else if(freq[task - 'A'] > max){
                max = freq[task - 'A'];
                maxCount = 1;
            }
        }
        
        int blankSeq = max - 1;
        int lengthOfBlankSeq = n - (maxCount - 1);
        
        int emptySlots = blankSeq * lengthOfBlankSeq;
        
        int availableTasks = tasks.length - (max * maxCount);
        
        int idleTime = emptySlots - availableTasks;
        
        if(idleTime > 0) return idleTime + tasks.length;
        return tasks.length;
        
    }
}