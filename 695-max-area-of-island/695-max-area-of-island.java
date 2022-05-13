class Solution {
    int current = 0;
    public int maxAreaOfIsland(int[][] grid) {
        
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int max = 0;
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    
                    findArea(i,j,grid,visited);
                    max = Math.max(current,max);
                    current = 0;
                }
            }
        }
        
        
        
        return max;
    }
    
    public void findArea(int i, int j, int[][] graph, boolean[][] visited){
        
        if(i < 0 || j < 0 || i >= graph.length || j >= graph[0].length || graph[i][j] == 0 || visited[i][j]) return;
        
        visited[i][j] = true;
        current++;
        
        findArea(i+1,j,graph,visited);
        findArea(i-1,j,graph,visited);
        findArea(i,j+1,graph,visited);
        findArea(i,j-1,graph,visited);
    }
}