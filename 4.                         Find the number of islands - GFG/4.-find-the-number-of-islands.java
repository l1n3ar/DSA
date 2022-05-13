// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int number = 0;
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                        dfs(grid,visited,i,j);
                        number++;
                } 
            }
        }
    
    return number;
    }
    
    
    public static void dfs(char[][] graph, boolean[][] visited, int i, int j){
        
        if(i >= graph.length || i < 0 || j >= graph[0].length || j < 0 || graph[i][j] == '0' || visited[i][j]) return;
        
        visited[i][j] = true;
        
        dfs(graph,visited,i+1,j);
        dfs(graph,visited,i-1,j);
        dfs(graph,visited,i,j-1);
        dfs(graph,visited,i,j+1);
        dfs(graph,visited,i+1,j+1);
        dfs(graph,visited,i-1,j+1);
        dfs(graph,visited,i-1,j-1);
        dfs(graph,visited,i+1,j-1);
        
        
    }
}