class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        for(int i = 0;i<strs.length;i++){
            
            String current = strs[i];
            char[] ch = current.toCharArray();
            Arrays.sort(ch);
            
            String s = String.valueOf(ch);
            
            if(map.containsKey(s)) map.get(s).add(current);
            else{
                ArrayList<String> newList = new ArrayList<>();
                newList.add(current);
                map.put(s,newList);
            }
        }
        
        for(String s : map.keySet()){
            res.add(new ArrayList<>(map.get(s)));
        }
        
        
        
        
        return res;
    }
}