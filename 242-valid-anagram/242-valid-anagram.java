class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];
        
        for(int i = 0;i<s.length();i++){
            char current = s.charAt(i);
            a[current]++;
        }
         for(int i = 0;i<t.length();i++){
            char current = t.charAt(i);
            b[current]++;
        }
        
        for(int i=0;i<256;i++){
            if(a[i]!=b[i]) return false;
        }
        
        return true;
        
    }
}