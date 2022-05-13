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
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            Solution obj = new Solution();
            int ans = obj.xShape(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the number of 'X' total shapes.
    public int xShape(char[][] grid)
    {
        // code here
        int number = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 'X' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    number++;
                }
            }
        }
        
        
        
        return number;
    }
    
    public void dfs(int row, int col, char[][] graph, boolean[][] visited){
        
        if(row < 0 || row >= graph.length || col < 0 || col >= graph[0].length || visited[row][col] || graph[row][col] == 'O') return;
        
        visited[row][col] = true;
        
        dfs(row+1,col,graph,visited);
        dfs(row-1,col,graph,visited);
        dfs(row,col+1,graph,visited);
        dfs(row,col-1,graph,visited);
    }
}