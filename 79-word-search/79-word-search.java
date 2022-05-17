class Solution {
    public boolean exist(char[][] board, String word) {
        
        // boolean found = false;
        boolean[][] visited = new boolean[board.length][board[0].length];
      
            for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                    if(find(i,j,board,word,visited,0)) return true;
                }
        }
         return false;
    }
    
    public static boolean find(int x, int y, char[][] arr, String word, boolean[][] visited,int current){
        
          if(current == word.length()) return true;
          
        
        if(x < 0 || y < 0 || x >= arr.length || y >= arr[0].length || visited[x][y]) return false;
        if(arr[x][y]!=word.charAt(current)) return false;
        
        visited[x][y] = true;
       
        boolean result = find(x+1,y,arr,word,visited,current+1)||find(x-1,y,arr,word,visited,current+1)||find(x,y+1,arr,word,visited,current+1)||find(x,y-1,arr,word,visited,current+1);
        
        visited[x][y] = false;
        
        
        return result;
       
    }
}