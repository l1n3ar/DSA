class Solution {
    public int leastInterval(char[] tasks, int n) {
        
     
        if(n == 0 || tasks.length == 0) return tasks.length;
        
        int frequency[] = new int[26];
        
        for(int i = 0;i<tasks.length;i++){
            frequency[tasks[i] - 'A']++;
        }
        
        Arrays.sort(frequency);
        
        int max = (frequency[25] - 1)  ;
        int idleSlots = max * n;
        
        for(int i = 24;i>=0;i--){
            idleSlots-= Math.min(frequency[i], max);
        }
        
        
        
        
        if(idleSlots > 0) return idleSlots + tasks.length;
        
        return tasks.length;
        
    }
}