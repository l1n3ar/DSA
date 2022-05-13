// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find unit area of the largest region of 1s.
    int currentArea = 0;
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int max = Integer.MIN_VALUE;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                int current = grid[i][j];
                if(current == 1 && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    max = Math.max(currentArea,max);
                    currentArea = 0;
                }
            }
        }
        
        
        
        return max;
    }
    
    public void dfs(int r, int c, int[][] graph, boolean[][] visited){
        
        
        if(r < 0 || r >= graph.length || c < 0 || c >= graph[0].length || graph[r][c] == 0|| visited[r][c]) return;
        
        visited[r][c] = true;
        currentArea++;
        
        dfs(r+1,c,graph,visited);
        dfs(r-1,c,graph,visited);
        dfs(r,c+1,graph,visited);
        dfs(r,c-1,graph,visited);
        dfs(r+1,c+1,graph,visited);
        dfs(r-1,c-1,graph,visited);
        dfs(r+1,c-1,graph,visited);
        dfs(r-1,c+1,graph,visited);
        
        
        
    }
}