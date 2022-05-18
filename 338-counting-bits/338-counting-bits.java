class Solution {
    public int[] countBits(int n) {
        
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1;i<=n;i++){
            int current = count(i);
            res[i] = current;
        }
        
        return res;
    }
    
    public int count(int n){
        
        int res = 0;
        while(n >0){
            n = n & (n-1);
            res++;
        }
        
        return res;
    }
}