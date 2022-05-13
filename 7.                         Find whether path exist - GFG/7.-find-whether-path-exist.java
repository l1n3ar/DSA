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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    if(dfs(i,j,grid,visited)) return true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean dfs(int row, int col, int[][] graph, boolean[][] visited){
        
        
        if(row < 0 || row >= graph.length || col < 0 || col >= graph[0].length || visited[row][col] || graph[row][col] == 0) return false;
        
        
        if(graph[row][col] == 2) return true;
        
        visited[row][col] = true;
        
         boolean down = dfs(row+1,col,graph,visited);
         if(down) return true;
         boolean up = dfs(row-1,col,graph,visited);
         if(up) return true;
         boolean right = dfs(row,col+1,graph,visited);
         if(right) return true;
         boolean left = dfs(row,col-1,graph,visited);
         if(left) return true;
        
        
        // visited[row][col] = false;
        return false;
    }
}