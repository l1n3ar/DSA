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
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,-1, adj,visited)) return true;
            }
        }
        
        return false;
    }
    
    public static boolean dfs(int current, int parent, ArrayList<ArrayList<Integer>> graph, boolean[] visited){
        
        if(visited[current] == true) return true;
        
        visited[current] = true;
        
        for(int edge : graph.get(current)){
            
            if(visited[edge] && edge!=parent) return true;
            else if(!visited[edge]){
                if(dfs(edge, current, graph, visited)) return true;
            }
        }
        
        return false;
    }
}