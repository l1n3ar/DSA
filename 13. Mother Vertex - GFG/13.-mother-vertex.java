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
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            Solution obj = new Solution();
            int ans = obj.findMotherVertex(V, adj);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        
        boolean[] visited = new boolean[V];
        ArrayList<Integer> mother = new ArrayList<>();
        
        for(int i = 0;i<V;i++){
            
            boolean allVisited = true;
            
            dfs(i,adj,visited);
            
            for(int j = 0;j<visited.length;j++){
                if(!visited[j]) allVisited = false;
            }
            
            if(allVisited) mother.add(i);
            
            Arrays.fill(visited, false);
              

        }
        
        Collections.sort(mother);
        
        return mother.size() == 0 ? -1 : mother.get(0);
        
    }
    
    public void dfs(int current, ArrayList<ArrayList<Integer>> graph, boolean[] visited){
        
        if(visited[current]) return;
        
        visited[current] = true;
        
        for(int edge : graph.get(current)){
            if(!visited[edge]) dfs(edge,graph,visited);
        }
    }
}