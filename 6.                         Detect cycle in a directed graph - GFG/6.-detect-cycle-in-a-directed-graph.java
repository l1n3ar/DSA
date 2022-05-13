// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
      boolean[] st = new boolean[V];
        boolean[] visited = new boolean[V];
        
        for(int i = 0;i<V;i++){
         
                if(dfs(i,adj,st,visited)) return true;
            
        }
        
        return false;
    }
    
    public static boolean dfs(int current, ArrayList<ArrayList<Integer>> graph, boolean[] st, boolean[] visited){
        
        
       if(st[current]) return true;
       if(visited[current]) return false;
        
        visited[current] = true;
        st[current] = true;
        
        for(int edge : graph.get(current))
        {
                if(dfs(edge,graph,st,visited)) return true;
            
       
            
        }
        
        
        st[current] = false;
        return false;
    }
}
